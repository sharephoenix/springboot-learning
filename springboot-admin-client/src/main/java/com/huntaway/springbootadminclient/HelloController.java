package com.huntaway.springbootadminclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/heima/hello")
    public String hello() {
        return "hello SpringBoot controller!!";
    }

    @Autowired
    public Environment env;
}
