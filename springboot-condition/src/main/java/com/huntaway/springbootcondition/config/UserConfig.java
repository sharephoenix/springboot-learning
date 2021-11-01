package com.huntaway.springbootcondition.config;

import com.huntaway.springbootcondition.condition.ClassCondition;
import com.huntaway.springbootcondition.condition.ConditionOnClass;
import com.huntaway.springbootcondition.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

//从Spring3.0，@Configuration用于定义配置类，可替换xml配置文件，
//        被注解的类内部包含有一个或多个被@Bean注解的方法，
//        这些方法将会被AnnotationConfigApplicationContext
//        或AnnotationConfigWebApplicationContext类进行扫描，
//        并用于构建bean定义，初始化Spring容器。
@Configuration
public class UserConfig {
    @Bean
//    @Conditional(value = ClassCondition.class)
    @ConditionOnClass("redis.clients.jedis.Jedis")
    public User user() {
        // 满足 ClassCondition 判断是否创建 User 这个 bean
        return new User();
    }

    @Bean
    // 配置文件中有 itcast=itheima 键值对
    @ConditionalOnProperty(name = "itcast", havingValue = "itheima")
    public User user2() {
        return new User();
    }
}
