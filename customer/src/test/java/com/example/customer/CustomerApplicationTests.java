package com.example.customer;

import com.example.customer.service.CustomerService;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CustomerApplicationTests {

    @Autowired
    CustomerService customerService;

    @Test
    void contextLoads() {
        customerService.customer();
    }

}
