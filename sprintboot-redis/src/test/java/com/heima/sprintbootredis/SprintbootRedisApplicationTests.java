package com.heima.sprintbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SprintbootRedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testSet() {
        redisTemplate.boundValueOps("nickname").set("张三");
    }

    @Test
    public void testGet() {
        Object name = redisTemplate.boundValueOps("nickname").get();
        System.out.println(name);
    }
    @Test
    void contextLoads() {
    }

}
