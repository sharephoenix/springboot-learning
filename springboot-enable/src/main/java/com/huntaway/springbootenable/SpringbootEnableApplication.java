package com.huntaway.springbootenable;

import com.huntaway.springbootenableother.config.EnableCuser;
import com.huntaway.springbootenableother.config.MyImportBeanDefinitionRegistrar;
import com.huntaway.springbootenableother.config.MyImportSelector;
import com.huntaway.springbootenableother.config.UserConfig;
import com.huntaway.springbootenableother.domain.Role;
import com.huntaway.springbootenableother.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import redis.clients.jedis.Jedis;

/**
 * @ComponentScan 扫描的范围是音牵引到勒所在包及其子包
 * 1. 使用 @ComponentScan 扫描配置类的包
 * 2. @Import 注解, 都会别 Spring 创建，并放进 IOC 容器
 * 3. 可以对 Import 注解进行 自定义处理 @EnableCuser
 */

/**
 * Import 的四种用法
 * 1. 倒入 Bean
 * @Import(User.class)
 *  User user = context.getBean(User.class);
 *  Object userType = context.getBeansOfType(User.class);
 *  2. 倒入配置类
 *  3. 导入 ImportSelector 的实现类
 *  4. 导入 ImportBeanDefinitionRegistrar 的实现类
 */

//@ComponentScan("com.huntaway.springbootenableother.config")
//@Import(UserConfig.class)
//@EnableCuser
// Import 的用法 1
//@Import(User.class)
//@Import(UserConfig.class) // UserConfig 中的 Configration 注解可以不加
//@Import(MyImportSelector.class)
@Import(MyImportBeanDefinitionRegistrar.class)
@SpringBootApplication
public class SpringbootEnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootEnableApplication.class, args);

//        Object user = context.getBean("user");
//        System.out.println(user);

//        User user = context.getBean(User.class);
//        Object userType = context.getBeansOfType(User.class);
//        System.out.println(user);
//        System.out.println(userType);
//
//        Role role = context.getBean(Role.class);
//        System.out.println(role);
//        System.out.println(userType);

        Jedis jedis = context.getBean(Jedis.class);
        String nickname = jedis.get("nickname");
        System.out.println(jedis);
        System.out.println(nickname);
    }

//    @Bean
//    public Jedis jedis() {
//        return new Jedis("localhost", 6379);
//    }
}
