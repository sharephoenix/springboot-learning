package cn.huntaway.controller;

import cn.huntaway.projo.Dept;
import cn.huntaway.services.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Consumer;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    public DiscoveryClient discoveryClient;
    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @RequestMapping(path = "/dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept queryById(@PathVariable("id") Long id) {
        Dept dept = deptService.queryById(id);
        if (dept == null) {
            throw new RuntimeException("id:" + id + "-不存在");
        }
        return dept;
    }

    // 备选方案
    public Dept hystrixGet(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDname("id:" + id + "-不存在").setDb_source("no this database in Mysql");
    }

    @RequestMapping(path = "/dept/list", method = RequestMethod.GET)
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    // 获取注册进来的微服务， 获取一些信息
    @RequestMapping(method = RequestMethod.GET, path = "/dept/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        System.out.println("instanc:" + services);
        // 得到一个具体的微服务信息
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        instances.forEach(new Consumer<ServiceInstance>() {
            @Override
            public void accept(ServiceInstance serviceInstance) {
                System.out.println(serviceInstance.getHost() + "\n"
                + serviceInstance.getUri() + "\n"
                + serviceInstance.getInstanceId() + "\n"
                + serviceInstance.getPort());
            }
        });
        return this.discoveryClient;
    }
}
