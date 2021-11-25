package cn.huntaway.springcloud.config;

import cn.huntaway.projo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    // 理解：消费者，不应该有 server 层
    // RestTemplate ... 供我们直接调用就可以了！注册到 spring 中
    // （url, 实体：Map，Class<T> responseType）

    private static final String REST_URL_PREFIX = "http://localhost:9001";

    @Autowired
    private RestTemplate restTemplate; // 提供多种便捷访问远程 http 服务的方法，简单的 Restful 服务模版～

    @RequestMapping(path = "/consumer/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping(path = "/consumer/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping(path = "/consumer/dept/list", method = RequestMethod.GET)
    public List<Dept> getAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }
}
