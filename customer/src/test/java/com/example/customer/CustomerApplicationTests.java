package com.example.customer;

import com.example.customer.service.CustomerServiceImpl;
import com.example.interfaces.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerApplicationTests {


    @Autowired
    CustomerService service;

    @Test
    void contextLoads() {
        System.out.println(service.customer());
        service.customer();
    }

}
