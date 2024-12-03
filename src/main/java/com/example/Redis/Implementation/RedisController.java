package com.example.Redis.Implementation;

import com.example.Redis.Implementation.request.KeyRequest;
import com.example.Redis.Implementation.request.KeyValueRequest;
import com.example.Redis.Implementation.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @PostMapping("/set")
    public String setValue(@RequestBody KeyValueRequest keyValueRequest) {
        int timeout = 120;
        redisService.setValue(keyValueRequest.getKey(), keyValueRequest.getValue(),timeout);
        return "Values updated successfully";
    }

    @GetMapping("/get")
    public String getValue(@RequestBody KeyRequest keyRequest) {
        return redisService.getValue(keyRequest.getKey());
    }
}
