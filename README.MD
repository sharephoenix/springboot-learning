## Java Spring-boot 学习进度
[黑马程序员SpringBoot教程，6小时快速入门Java微服务架构Spring Boot](https://www.bilibili.com/video/BV1Lq4y1J77x?p=18)

## Springboot 高级-配置

- Condition

## SpringBoot 切换内部 web 服务器

- Tomcat 是默认的内置服务器

```xml
 <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jetty</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-tomcat</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

```

## Springboot 自动配置

- @Enable*
- @EnableAutoConfiguration
- @Import

```doc

/**
 * @ComponentScan 扫描的范围是音牵引到勒所在包及其子包
 * 1. 使用 @ComponentScan 扫描配置类的包
 * 2. @Import 注解, 都会别 Spring 创建，并放进 IOC 容器
 * 3. 可以对 Import 注解进行 自定义处理 @EnableCuser
 */

```


## Springboot @Import
1. 倒入 Bean
2. 倒入配置类
3. 倒入 ImportSelector 实现类。一般用于加载配置文件中的类
4. 倒入 ImportBeanDefinitionRegistrar 实现类


## Springboot @EnableAutoConfiguration 注解

## 自定义 Starter

1. 创建 redis-springboot-autoconfigre
2. 创建 redis-springboot-starter 模块，依赖 redis-spring-boot-autoconfigure 的模块
3. 在 redis-spring-boot-autoconfigure 模块中初始化 Jedis 的 Bean。并定义 META-INF/spring.factories 文件
4. 在测试模块中引入自定义的 redis-starter 依赖，测试获取 Jedis 的 Bean，操作 redis


## Java 的监听机制
1. 事件： Event，继承 java.util.EventObject 类的对象
2. 事件源：Source，任意对象 Object
3. 监听器：Listener，实现 java.util.EventListener 接口的对象

## Springboot 监听机制

Springboot 在项目启动时，会对几个监听器进行毁掉，我们可以实现这些监听的接口




