package com.example.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author YZY
 * @date 2020/5/12 - 19:11
 */
@Service
@Component
public class ProviderServiceImple implements ProviderService {
    @Override
    public String provide() {
        return "provide";
    }
}
