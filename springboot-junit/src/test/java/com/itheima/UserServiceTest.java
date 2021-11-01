package com.itheima;

import com.itheima.springbootjunit.SpringbootJunitApplication;
import com.itheima.springbootjunit.Userservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * UserService 的测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJunitApplication.class)
public class UserServiceTest {

    @Autowired
    private Userservice userservice;

    @Test
    public void testAdd() {
        userservice.add();
    }
}
