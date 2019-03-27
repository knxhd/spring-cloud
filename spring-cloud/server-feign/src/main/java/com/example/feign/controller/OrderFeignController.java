package com.example.feign.controller;

import com.example.feign.entity.UserEntity;
import com.example.feign.server.OrderFeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping(value = "getAllMember", method = RequestMethod.GET)
    public List<String> getAllMember() {
        return orderFeignServer.getAllMember();
    }

    @RequestMapping(value = "getTestGetParameter", method = RequestMethod.POST)
    public List<UserEntity> getTestGetParameter(@RequestBody UserEntity userEntity) {
        return orderFeignServer.getTestGetParameter(userEntity);
    }

    @RequestMapping(value = "getTestParameter", method = RequestMethod.GET)
    public List<String> getTestParameter(String strings) {
        return orderFeignServer.getTestParameter(strings);
    }

    @RequestMapping(value = "getTestArrayParameter", method = RequestMethod.GET)
    public List<String> getTestArrayParameter(String strings[]) {
        return orderFeignServer.getTestArrayParameter(strings);
    }
}
