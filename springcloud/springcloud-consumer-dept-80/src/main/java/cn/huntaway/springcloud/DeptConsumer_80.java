package cn.huntaway.springcloud;

import cn.myrule.HuntAwayRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
//@ComponentScan("org.springframework.web.client.*")
// 在微服务启动的时候，就去加载自定义的 Ribbon 类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = HuntAwayRule.class)
public class DeptConsumer_80 {

//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }
}
