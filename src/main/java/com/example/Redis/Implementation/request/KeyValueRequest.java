package com.example.Redis.Implementation.request;

import lombok.Data;

@Data
public class KeyValueRequest {
    private String key;
    private String value;
}
