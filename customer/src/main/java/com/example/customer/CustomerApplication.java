package com.example.customer;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo() //开启dubbo
@SpringBootApplication
public class CustomerApplication {

    public static void  main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

}
