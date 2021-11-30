# 学习 SpringCloud
[【狂神说Java】SpringCloud最新教程IDEA版](https://www.bilibili.com/video/BV1jJ411S7xr?p=5&spm_id_from=pageDriver)

## 补差不缺
监控框架： skywalking
其他框架： sentinel

## Eureka
* Eureka 是 Netflix 的子模块

## Ribbon 
* 用于负载均衡 
* Feign 基于 web services 调用；面向接口编程

## Hystrix 
* 功能：服务熔断 服务降级 流量监控

服务熔断：服务端，某个服务器超时或者异常，引起熔断，保险丝～
服务剪辑：客户端！从整体网站请求负载烤炉！。当某个服务熔断或者关闭之后，服务将不再被调用！
        此时在客户端，我们可以准备一个 FallbackFactory，返回一个默认的值（缺省值），真题的服务水平降下来，但是好歹能用

* hystrix [dashboard]("http://localhost:9010/hystrix")