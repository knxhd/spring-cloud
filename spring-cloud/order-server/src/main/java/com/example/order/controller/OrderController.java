package com.example.order.controller;

import com.example.order.service.OrderMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName OrderController
 * @description
 * @author: tianluhua
 * @date 2019/3/20 21:54
 */
@RestController
@RequestMapping("OrderController")
public class OrderController {

    private final OrderMemberService orderMemberService;

    @Value(value = "server.port")
    private  String port;

    @Autowired
    public OrderController(OrderMemberService orderMemberService) {
        this.orderMemberService = orderMemberService;
    }

    @RequestMapping(value = "getAllOrderMemeber", method = RequestMethod.GET)
    public List<String> getAllOrderMemeber() {
        return orderMemberService.getAllOrderMemeber();
    }


    @RequestMapping(value = "getAllPrices", method = RequestMethod.GET)
    public List<String> getAllPrices() {
        return orderMemberService.getAllPrices();
    }


    @RequestMapping(value = "getAllGoods", method = RequestMethod.GET)
    public List<String> getAllGoods() {
        return orderMemberService.getAllGoods();
    }
}
