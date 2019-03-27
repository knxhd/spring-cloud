package com.example.feign.controller;

import com.example.feign.server.OrderFeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName OrderFeignController
 * @description
 * @author: tianluhua
 * @date 2019/3/27 16:52
 */
@RestController
@RequestMapping("OrderFeignController")
public class OrderFeignController {

    @Autowired
    private OrderFeignServer orderFeignServer;

    @RequestMapping(value = "getAllMember",method = RequestMethod.GET)
    public List<String> getAllMember() {
        return orderFeignServer.getAllMember();
    }


}
