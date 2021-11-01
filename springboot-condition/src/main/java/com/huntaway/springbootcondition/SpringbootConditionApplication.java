package com.huntaway.springbootcondition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class SpringbootConditionApplication {

    public static void main(String[] args) {
        // 启动 Springboot 的应用，返回 Spring 的容器
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootConditionApplication.class, args);
//        Object redisTemplate = context.getBean("redisTemplate");
//        System.out.println(redisTemplate);

        Object user = context.getBean("user2");
        System.out.println(user);
    }

}
