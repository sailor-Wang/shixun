package com.shixun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = { "com.shixun"})
public class SysBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SysBootApplication.class, args);
    }
}
