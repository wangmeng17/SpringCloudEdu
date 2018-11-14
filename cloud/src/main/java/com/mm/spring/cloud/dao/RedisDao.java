package com.mm.spring.cloud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/12  15:35
 * @Description:
 */
@Repository
public class RedisDao {

    @Autowired
    private StringRedisTemplate template;

    public void setKey(String key, String value) {
        ValueOperations<String, String> operations = template.opsForValue();
        operations.set(key, value, 1, TimeUnit.HOURS);
    }

    public String getValue(String key) {
        ValueOperations<String, String> operations = template.opsForValue();
        return operations.get(key);
    }
}
