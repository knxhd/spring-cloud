package com.example.feign.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

}
