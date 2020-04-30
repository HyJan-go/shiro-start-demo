package com.example.shirostarterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用spring boot 集成的start的shiro进行学习的小demo
 * 默认提供了一些配置，在配置文件中填写即可
 */
@SpringBootApplication
public class ShiroStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroStarterDemoApplication.class, args);
    }

}
