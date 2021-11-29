package cn.huntaway.controller;

import cn.huntaway.projo.Dept;
import cn.huntaway.services.DeptService;
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
    public Dept queryById(@PathVariable("id") Long id) {
        return deptService.queryById(id);
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
