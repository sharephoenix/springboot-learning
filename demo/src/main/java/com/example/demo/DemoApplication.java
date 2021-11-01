package com.example.demo;

import com.example.demo.controller.Person;
import com.example.demo.model.GreetPostRequest;
import com.example.demo.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
@RestController
public class DemoApplication {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();



    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        return greeting;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/greet/{coin}")
    public Greeting greetingPost(@RequestBody GreetPostRequest request, @PathVariable String coin) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, request.name + coin));
        return greeting;
    }
}
