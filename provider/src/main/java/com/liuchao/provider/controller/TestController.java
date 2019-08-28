package com.liuchao.provider.controller;

import com.liuchao.provider.entity.User;
import com.liuchao.provider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;


    @RequestMapping("/userbyid")
    public User userbyid(@RequestParam("id")String id){

      //  User byId = testService.findById(Integer.valueOf(id));
        User user = testService.selectByPrimaryKey(id);
        return user;

    }
}
