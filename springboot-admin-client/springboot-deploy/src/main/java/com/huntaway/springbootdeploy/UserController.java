package com.huntaway.springbootdeploy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("/findAll")
    public String findAll() {
        return "success";
    }
}
