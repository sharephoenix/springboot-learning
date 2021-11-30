package cn.huntaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashboard_9010 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard_9010.class, args);
    }
}
