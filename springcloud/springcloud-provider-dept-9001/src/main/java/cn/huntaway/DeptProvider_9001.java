package cn.huntaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@EnableEu
public class DeptProvider_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_9001.class, args);
    }
}
