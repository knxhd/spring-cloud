package com.example.member.controller;

import com.example.member.entity.UserEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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


    @RequestMapping(value = "getTestGetParameter", method = RequestMethod.POST)
    public List<UserEntity> getTestGetParameter(@RequestBody UserEntity userEntity) {
        List<UserEntity> userEntityList = new ArrayList<>();
        userEntityList.add(userEntity);
        return userEntityList;
    }

    @RequestMapping(value = "getTestParameter", method = RequestMethod.GET)
    public List<String> getTestParameter(@RequestParam(value = "strings") String strings){
        List<String> stringList=new ArrayList<>();
        Collections.addAll(stringList,strings);
        return stringList;
    }

    @RequestMapping(value = "getTestArrayParameter", method = RequestMethod.GET)
    public List<String> getTestArrayParameter(@RequestParam(value = "strings") String[] strings){
        List<String> stringList=new ArrayList<>();
        Collections.addAll(stringList,strings);
        return stringList;
    }
}
