package com.example.provider.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author YZY
 * @date 2020/5/13 - 18:38
 */
@Configuration
@EnableDubbo(scanBasePackages = "org.example.provider.service")
@PropertySource("classpath:application.properties")
public class ProviderConfig {
}
