package com.example.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName MemberController
 * @description
 * @author: tianluhua
 * @date 2019/3/20 21:50
 */
@RestController
@RequestMapping("MemberController")
public class MemberController {

    @RequestMapping(value = "getAllMember", method = RequestMethod.GET)
    public List<String> getAllMember() {
        List<String> memberList = new ArrayList<>();
        memberList.add("何以滥清幽");
        memberList.add("柯南小海盗");
        memberList.add("王者荣耀");
        return memberList;
    }

    @RequestMapping(value = "getAllPrices", method = RequestMethod.GET)
    public List<String> getAllPrices() {
        List<String> memberList = new ArrayList<>();
        memberList.add("何以滥清幽-价格");
        memberList.add("柯南小海盗-价格");
        memberList.add("王者荣耀-价格");
        return memberList;
    }
}
