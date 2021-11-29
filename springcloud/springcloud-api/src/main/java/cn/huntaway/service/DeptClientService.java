package cn.huntaway.service;

import cn.huntaway.projo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT")
@Component
public interface DeptClientService {
    @GetMapping("/dept/get/{id}")
    public Dept queryId(Long id);

    @GetMapping("/dept/list")
    public List<Dept> queryAll();

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept);
}
