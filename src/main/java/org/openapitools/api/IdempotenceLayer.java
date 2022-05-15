package org.openapitools.api;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.openapitools.model.InitiatePaymentProcess;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redis.clients.jedis.JedisPool;

@Component
public final class IdempotenceLayer implements DisposableBean {
    private static final String STARTED = "started";
    private JedisPool pool;

    @Autowired
    public IdempotenceLayer(JedisPool pool) {
        this.pool = pool;
    }

    public void addEntry(InitiatePaymentProcess initiatePaymentProcess) {
        String key = String.format("payment:%s", initiatePaymentProcess.getCheckoutId());
        Map<String, String> payload = new HashMap<>();
        payload.put("status", STARTED);
        payload.put("start", LocalDateTime.now().toString());

        try (var jedis = pool.getResource()) {
            jedis.hset(key, payload);
            jedis.expire(key, 60);
        } 
    }

    public boolean isStarted(InitiatePaymentProcess initiatePaymentProcess) {
        String key = String.format("payment:%s", initiatePaymentProcess.getCheckoutId());

        var result = false;
        try (var jedis = pool.getResource()) {
            String status = jedis.hget(key, "status");
            result = status != null && status.equals(STARTED);
        }
        return result;
    }

    @Override
    public void destroy() throws Exception {
        pool.destroy();  
    }
}
