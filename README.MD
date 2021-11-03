## Java Spring-boot 学习进度
[黑马程序员SpringBoot教程，6小时快速入门Java微服务架构Spring Boot](https://www.bilibili.com/video/BV1Lq4y1J77x?p=18)

## 相关命令
```shell
# 命令行运行
 ./mvnw spring-boot:run 
```

```shell
# 打包 jar 包
./mvnw clean package
# 运行 jar 包
java -jar target/demo-0.0.1-SNAPSHOT.jar
# 切换环境
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=pro
 
```

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

- Springboot 在项目启动时，会对几个监听器进行毁掉，我们可以实现这些监听的接口
一下两种需要在 META-INF/spring.factories 中配置后使用
```properties`
<!-- resources/META-INF/spring.factories -->
org.springframework.boot.SpringApplicationRunListener=\
  com.huntaway.springbootlistener.listener.MySpringApplicationRunListener
```
ApplicationContextInitializer
SpringApplicationRunListener

以下两个不需要配置就可以获取到
CommandLineRunner
ApplicationRunner
//        用缓存，将数据库的信息从数据库中读取到 redis 中（缓存预热）
//        一般和 CommandLineRunner 只用其中的一个


## Springboot 原理分析

- spring 加载全过程

## Springboot 监控 Actuator

实现程序内部运行情况的监控，比如监控状况/Bean加载情况/配置属性/日志信息
```
<!-- application.properties -->

#开启健康检查的完整信息
management.endpoint.health.show-details=always
#所有的监控 endpoint（url） 暴露
management.endpoints.web.exposure.include=*

```

## SpringBoot-Admin
-  图形话的方式查看监控信息
Client：想要被监控的 Spring 项目；
Server：接收 Client 内的信息，提供 UI 界面查看；
Client 向 Server 注册监听

* 底层原理还是 Actuator Endpoint
> admin-server
1. 创建 admin-server 模块
2. 导入依赖坐标 admin-starter-server
3. 在引导类上启用监控功能 @EnableAdminServer

> admin-client
1. 创建 admin-client 模块
2. 引入 admin-starter-client
3. 配置相关信息：server 地址等
4. 启动 server 和 client 服务，访问 server

## 部署
1. jar 包（官方推荐）
2. war 包 - 需要外部的 tomcat 服务器







