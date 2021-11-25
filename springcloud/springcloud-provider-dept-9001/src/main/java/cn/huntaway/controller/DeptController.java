package cn.huntaway.controller;

import cn.huntaway.projo.Dept;
import cn.huntaway.services.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @RequestMapping(path = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept queryById(@PathVariable("id") Long id) {
        System.out.println("xxxxxxxxx:" + id);
        return deptService.queryById(id);
    }

    @RequestMapping(path = "/dept/list", method = RequestMethod.GET)
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }
}
