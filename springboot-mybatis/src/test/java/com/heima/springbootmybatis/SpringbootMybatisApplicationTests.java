package com.heima.springbootmybatis;

import com.heima.springbootmybatis.domain.Account;
import com.heima.springbootmybatis.domain.Pingyin;
import com.heima.springbootmybatis.mapper.AccountMapper;
import com.heima.springbootmybatis.mapper.AccountXmlMapper;
import com.heima.springbootmybatis.mapper.PingyinMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private AccountXmlMapper accountXmlMapper;

    @Autowired
    private PingyinMapper pingyinMapper;

    @Test
    void testFindAll() {
        List<Account> list = accountMapper.findAll();
        System.out.println(list);
    }

    @Test
    void testFindAll2() {
        List<Account> list = accountXmlMapper.findAll();
        System.out.println(list);
    }

    @Test
    void getHanzi() {
        List<Pingyin> pingyin = pingyinMapper.getHanzi("♦️");
        System.out.println(pingyin.toString());
    }

    @Test
    void addHanzi() {
        int code = pingyinMapper.addHanzi("♦️", "fangp");
        System.out.println("addHanzi:" + code);
    }
}
