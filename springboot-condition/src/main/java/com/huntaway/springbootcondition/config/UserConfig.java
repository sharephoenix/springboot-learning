package com.huntaway.springbootcondition.config;

import com.huntaway.springbootcondition.condition.ClassCondition;
import com.huntaway.springbootcondition.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    @Conditional(value = ClassCondition.class)
    public User user() {
        // 满足 ClassCondition 判断是否创建 User 这个 bean
        return new User();
    }
}
