package com.example.Redis.Implementation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class RedisService {


    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private Jedis jedis;


    public void setValue(String key, String value,int timeout) {
        jedis.setex(key,timeout,value);
    }

    public String getValue(String key) {
        return jedis.get(key);
    }
}
