package org.openapitools.api;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.openapitools.model.InitiatePaymentProcess;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class IdempotenceLayer {
    private JedisPool pool;
    private static final String STARTED = "started";

    public IdempotenceLayer(
        @Value("redis.url") String redisUrl
    ) {
        this.pool = new JedisPool(redisUrl);
    }

    public void addEntry(InitiatePaymentProcess initiatePaymentProcess) {
        String key = String.format("payment:%s", initiatePaymentProcess.getCheckoutId());
        Map<String, String> payload = new HashMap<>();
        payload.put("status", STARTED);
        payload.put("start", LocalDateTime.now().toString());

        try (Jedis jedis = pool.getResource()) {
            jedis.hset(key, payload);
            jedis.expire(key, 60);
        }
        pool.close();
    }

    public boolean isStarted(InitiatePaymentProcess initiatePaymentProcess) {
        String key = String.format("payment:%s", initiatePaymentProcess.getCheckoutId());
        boolean result = false;

        try (Jedis jedis = pool.getResource()) {
            String status = jedis.hget(key, "status");
            result = status != null && status == STARTED;
        }

        pool.close();
        return result;
    }
}
