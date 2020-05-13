package com.example.customer.service;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.interfaces.service.CustomerService;
import com.example.interfaces.service.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @author YZY
 * @date 2020/5/13 - 18:28
 */
@Component
public class CustomerServiceImpl implements CustomerService {

    @Reference
    private ProviderService providerService;

    @Override
    public String customer() {
        return providerService.provide();
    }
}
