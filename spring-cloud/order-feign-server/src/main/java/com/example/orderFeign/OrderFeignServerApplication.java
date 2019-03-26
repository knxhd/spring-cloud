package com.example.orderFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.example.orderFeign.*"})
public class OrderFeignServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignServerApplication.class, args);
    }

}
