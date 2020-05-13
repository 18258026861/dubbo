package com.example.provider.service;

import com.example.interfaces.service.ProviderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author YZY
 * @date 2020/5/13 - 18:23
 */

@Service
@Component
public class ProviderServiceImple implements ProviderService {

    @Override
    public String provide() {
        return "provider";
    }
}
