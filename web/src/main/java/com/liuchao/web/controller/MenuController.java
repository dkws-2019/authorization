package com.liuchao.web.controller;

import com.liuchao.commonutil.entity.Menus;
import com.liuchao.providerfeign.provider.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Resource
    private Client client;

    @GetMapping("findAllMenu")
    public List<Menus> findAllMenu(){
        List<Menus> menu = client.findMenu(0+"");
        return menu;
    }
}
