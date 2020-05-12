package com.example.customer.service;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YZY
 * @date 2020/5/12 - 19:22
 */
@EnableDubbo
@Controller
public class CustomerService {

    @Reference
    private ProviderService providerService;

    @RequestMapping("/c")
    @ResponseBody
    public String customer(){
        return providerService.provide();
    };

}
