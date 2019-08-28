package com.liuchao.provider.controller;


import com.liuchao.provider.entity.Menu;
import com.liuchao.provider.entity.Menus;
import com.liuchao.provider.service.MenuService;
import com.liuchao.provider.util.BaseUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Resource
    private MenuService menuService;

    @GetMapping("/findAllMenu")
    public List<Menus> findMenu(@RequestParam("parentId")String parentId){
        List<Map<String,String>> allMenu = menuService.findByParentId(parentId);
        List<Menu> menusParent = BaseUtil.MapToMenu(allMenu);
        List<Menus> listMenus=new ArrayList<Menus>();
        for(Menu menu:menusParent){
            Menus menus=new Menus();
            menus.setHref(menu.getHref());
            menus.setIcon(menu.getIcon());
            menus.setMeta(menu.getMeta());
            menus.setParentId(menu.getParentId());
            menus.setId(menu.getId());
            menus.setName(menu.getName());
            listMenus.add(menus);

        }

        for(Menus menus:listMenus){
            Integer parentId1 = menus.getId();
            List<Menus> childListMenus = findMenu(parentId1+"");
            if(childListMenus==null || childListMenus.size()==0){
                menus.setChildren(null);
            }else{
                menus.setChildren(childListMenus);

            }


        }

        return listMenus;
    }


    }


