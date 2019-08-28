package com.liuchao.providerfeign.provider;

import com.liuchao.commonutil.entity.Menus;
import com.liuchao.commonutil.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("get-way")
public interface Client {

    @RequestMapping("/provider/test/userbyid")
    public User userbyid(@RequestParam("id")String id);

    @GetMapping("/provider/menu/findAllMenu")
    public List<Menus> findMenu(@RequestParam("parentId")String parentId);
}
