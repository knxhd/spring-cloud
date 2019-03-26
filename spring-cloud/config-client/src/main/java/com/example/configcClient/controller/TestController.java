package com.example.configcClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @description
 * @author: tianluhua
 * @date 2019/3/23 12:23
 */
@RestController
@RefreshScope
@RequestMapping("TestController")
public class TestController {

    @Value("${testName}")
    private String username;

    @RequestMapping("getUsername")
    public String getAlluserName() {
        return username;
    }

}
