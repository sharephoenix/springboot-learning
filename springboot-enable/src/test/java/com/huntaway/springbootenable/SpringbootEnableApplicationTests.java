package com.huntaway.springbootenable;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@SpringBootTest
class SpringbootEnableApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void result() {
        double[] arr = new double[]{2,10,19,2,58,20,10,10,21,10,17,15,10,1600,240,5,44,7,6.5,399.9,10,13,12,925,14.9,328.25,230,200,200,90,400,15,476,312.12,145,31.8,58,47,150,94,215,8,20,10,6.5,38,54.2,28,2.8,20,23.9,14,43.2,16.9,32.43,100,9,11.8,7.5,20.1,7.56,26,2,27.76,27,11,52.52,18.51,598,14.69,26,22.06,35,6,8,22.1,34,4,21,37,8,5,62,23,4.9,2.2,28.5,30,7,27,4,14,14,56,4,19.9,14,1.5,20,1.5,1.5,25.2,7.38,41.01,1.5,2.5,8.7,4.5,34,26,2.5,2.8,1.5,15,1.49,93,40};
//        ArrayList<Double> raw = new ArrayList<Double>();
//        for (int i = 0; i < arr.length; i++) {
//            raw.add(arr[i]);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[j] < arr[i]) {
//                    exchange(arr, i, j);
//                }
//            }
//        }
        // 8167.43
        // 8195.08
        // 8595.08 + 400
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println("result::" + (result - 400));
    }

    void exchange(double[] arr, int i, int j) {
        double value = arr[j];
        arr[j] = arr[i];
        arr[i] = value;
    }

}
