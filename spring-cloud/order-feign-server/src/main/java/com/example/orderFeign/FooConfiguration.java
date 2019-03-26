package com.example.orderFeign;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FooConfiguration
 * @description
 * @author: tianluhua
 * @date 2019/3/25 22:55
 */
@Configuration
public class FooConfiguration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
