package com.huntaway.springbootenableother.config;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Role;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({UserConfig.class})
public @interface EnableCuser {
}
