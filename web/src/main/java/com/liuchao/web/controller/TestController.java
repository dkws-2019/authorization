package com.liuchao.web.controller;

import com.liuchao.commonutil.entity.User;
import com.liuchao.providerfeign.provider.Client;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private Client client;

    @Resource
    private RedisTemplate redisTemplate;


    @RequestMapping("/test")
    public Object test(@RequestParam("id")String id){
        User userbyid = client.userbyid(id);

        return userbyid;

    }
}
