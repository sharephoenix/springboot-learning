package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        String[] arr = new String[]{"a", "b", "c", null};
        long count  = Arrays.stream(arr).count();
        System.out.println(count);

        System.out.println(Arrays.stream(arr).count());
    }

}
