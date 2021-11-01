package com.huntaway.springbootcondition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ClassCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        倒入 jetis 坐标 以后返回 true
        boolean flag = true;
        try {
//            判断 redis.clients.jedis.Jedis 文件是否存在
            Class<?> cls = Class.forName("redis.clients.jedis.Jedis");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }
}
