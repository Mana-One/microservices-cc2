package org.openapitools.api;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openapitools.model.InitiatePaymentProcess;
import org.openapitools.model.InitiatePaymentProcessResponse;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redis.clients.jedis.JedisPool;

@Component
public final class IdempotencyLayer implements DisposableBean {
    private static final String STARTED = "started";
    private JedisPool pool;

    @Autowired
    public IdempotencyLayer(JedisPool pool) {
        this.pool = pool;
    }

    public void addEntry(String idempotencyKey, InitiatePaymentProcessResponse initiatePaymentProcessResponse) {
        String key = String.format("payment:%s", idempotencyKey);
        Map<String, String> payload = new HashMap<>();
        payload.put("status", initiatePaymentProcessResponse.getStatus());
        payload.put("since", initiatePaymentProcessResponse.getSince());

        try (var jedis = pool.getResource()) {
            jedis.hset(key, payload);
            jedis.expire(key, 60);
        } 
    }

    public Optional<InitiatePaymentProcessResponse> retrieve(String idempotencyKey) {
        String key = String.format("payment:%s", idempotencyKey);

        Optional<InitiatePaymentProcessResponse> result = Optional.empty();
        try (var jedis = pool.getResource()) {
            String since = jedis.hget(key, "since");
            String status = jedis.hget(key, "status");
            
            if (since != null && status != null) {
                var data = new InitiatePaymentProcessResponse();
                data.setSince(since);
                data.setStatus(status);
                result = Optional.of(data);
            }
        }
        return result;
    }

    @Override
    public void destroy() throws Exception {
        pool.destroy();  
    }
}
