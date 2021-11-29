package cn.huntaway.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    // 配置负载均衡实现 RestTemplate

//    IRlue：
//    RoundRobinRule // 轮询
//    RandomRule // 随机
//    Retry 先按照轮询获取服务，如果获取失败，会在指定时间内重试
//    AvailbilityFilteringRule 先过滤崩溃（跳闸）服务，对剩下的进行轮询
    @Bean
    @LoadBalanced // Ribbon
    public RestTemplate getRestTemplate() {
        System.out.println("getRestTemplate");
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }

}
