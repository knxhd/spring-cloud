package com.example.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName OrderMemberService
 * @description
 * @author: tianluhua
 * @date 2019/3/20 22:03
 */
@Service
public class OrderMemberService {

    @Autowired
    private RestTemplate restTemplate;


    public List<String> getAllOrderMemeber() {
        return restTemplate.getForObject("http://member-server/MemberController/getAllMember", List.class);

    }

    public List<String> getAllGoods() {
        return restTemplate.getForObject("http://member-server/MemberController/getAllGoods", List.class);

    }

    public List<String> getAllPrices() {
        return restTemplate.getForObject("http://member-server/MemberController/getAllPrices", List.class);

    }
}
