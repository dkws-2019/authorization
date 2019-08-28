package com.liuchao.provider.service;

import com.liuchao.provider.entity.MenuEntity;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;
import java.util.Map;

public interface MenuService extends BaseMapper<MenuEntity> {
    public List<Map<String,String>> findByParentId(@Param("parentId")String parentId);
}
