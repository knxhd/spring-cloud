package com.example.feign.server;

import com.example.feign.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName OrderFeignServer
 * @description
 * @author: tianluhua
 * @date 2019/3/27 16:47
 */
@FeignClient("member-server")
public interface OrderFeignServer {

    @RequestMapping(method = RequestMethod.GET,value = "/MemberController/getAllMember")
    public List<String> getAllMember();


    @RequestMapping(method = RequestMethod.POST,value = "/MemberController/getTestGetParameter")
    public List<UserEntity> getTestGetParameter(@RequestBody UserEntity userEntity);

    @RequestMapping(method = RequestMethod.GET,value = "/MemberController/getTestParameter")
    public List<String> getTestParameter(@RequestParam(value = "strings") String strings);


    @RequestMapping(method = RequestMethod.GET,value = "/MemberController/getTestArrayParameter")
    public List<String> getTestArrayParameter(@RequestParam(value = "strings") String strings[]);
}
