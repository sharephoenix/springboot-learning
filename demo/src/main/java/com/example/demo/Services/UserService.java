package com.example.demo.Services;

import com.example.demo.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    public User findUserById(String user) {
        return new User();
    }

    public User findByUsername(User user) {
        return new User();
    }
}
