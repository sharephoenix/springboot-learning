package com.huntaway.springbootlistener.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 当项目启动后执行 run 方法
 * 可以在项目启动后
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        用缓存，将数据库的信息从数据库中读取到 redis 中（缓存预热）
//        一般和 CommandLineRunner 只用其中的一个
        System.out.println("MyApplicationRunner-runner" + Arrays.asList(args.getSourceArgs()));
    }
}
