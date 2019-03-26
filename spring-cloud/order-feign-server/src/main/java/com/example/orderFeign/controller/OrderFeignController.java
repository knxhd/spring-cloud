package com.example.orderFeign.controller;

import com.example.orderFeign.server.OrderFeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName OrderFeignController
 * @description
 * @author: tianluhua
 * @date 2019/3/25 22:22
 */
@RestController
@RequestMapping("/orderFeignController")
public class OrderFeignController {

    @Autowired
    private OrderFeignServer orderFeignServer;

    @RequestMapping(value = "getAllMember")
    public List<String> getAllMember() {
        List<String> allMember = orderFeignServer.getAllMember();
        return allMember;

    }
}
