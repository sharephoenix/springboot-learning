package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("/heima/hello")
    public String hello() {
        return "hello SpringBoot controller!!" + this.person.toString();
    }

    @Autowired
    public Environment env;
}
