package cn.huntaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker  // 添加熔断的支持
public class DeptProvider_9004 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_9004.class, args);
    }
}
