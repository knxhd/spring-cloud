package com.example.orderFeign.server;

import com.example.orderFeign.FooConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @description
 * @author: tianluhua
 * @date 2019/3/25 22:19
 */
@FeignClient(value = "member-server",configuration = FooConfiguration.class)
public interface OrderFeignServer {

    @RequestMapping("/MemberController/getAllPrices")
    public List<String> getAllMember();
}
