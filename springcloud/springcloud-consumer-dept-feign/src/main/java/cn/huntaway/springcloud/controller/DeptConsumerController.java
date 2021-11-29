package cn.huntaway.springcloud.controller;

import cn.huntaway.projo.Dept;
import cn.huntaway.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    DeptClientService deptClientService;

    @RequestMapping(path = "/consumer/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptClientService.addDept(dept);
    }

    @RequestMapping(path = "/consumer/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.queryId(id);
    }

    @RequestMapping(path = "/consumer/dept/list", method = RequestMethod.GET)
    public List<Dept> getAll() {
        return deptClientService.queryAll();
    }
}
