package com.liuchao.providerfeign.provider;

import com.liuchao.commonutil.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("get-way")
public interface Client {

    @RequestMapping("/provider/test/userbyid")
    public User userbyid(@RequestParam("id")String id);
}
