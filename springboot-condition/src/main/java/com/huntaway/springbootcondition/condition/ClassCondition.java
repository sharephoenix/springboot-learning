package com.huntaway.springbootcondition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.ArrayList;
import java.util.Map;

public class ClassCondition implements Condition {

    /**
     *
     * @param context 上下文对象， 用于获取环境， IOC容器，ClassLoader 对象
     * @param metadata 可以获取注解定义的属性值
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        boolean flag = true;
//        获取注解属性值
        Map<String, Object> map = metadata.getAnnotationAttributes(ConditionOnClass.class.getName());
        String[] values = (String[]) map.get("value");
        try {

            for (String className : values) {
                Class<?> cls = Class.forName(className);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            flag = false;
        }

        return flag;

//        Environment environment = context.getEnvironment();
//        倒入 jetis 坐标 以后返回 true
//        boolean flag = true;
//        try {
////            判断 redis.clients.jedis.Jedis 文件是否存在
//            Class<?> cls = Class.forName("redis.clients.jedis.Jedis");
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            flag = false;
//        }
//
//        return flag;
    }
}
