package cn.huntaway.service;

import cn.huntaway.projo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

// 降级
@Component
public class DeptClientServiceCallbackFactory implements FallbackFactory {
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept queryId(Long id) {
                return new Dept()
                        .setDname("id:" + id)
                        .setDname("没有对应的信息，客户端提供降级服务，这个服务已经被关闭")
                        .setDb_source("no sql in Mysql");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
