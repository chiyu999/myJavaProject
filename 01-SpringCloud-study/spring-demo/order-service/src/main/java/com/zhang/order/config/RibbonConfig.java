package com.zhang.order.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 负载均衡配置类
 */
@Configuration
public class RibbonConfig {
    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }
}
