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