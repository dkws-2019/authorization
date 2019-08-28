package com.liuchao.provider.service;

import com.liuchao.provider.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.BaseMapper;

public interface TestService extends BaseMapper<User> {

    //@Select("select * from User where id=#{id}")
   // public User findById(@Param("id")Integer id);
}
