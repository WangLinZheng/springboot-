package com.wlz.cont.user.dao;


import com.wlz.cont.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    List<User> getAllUser(Map map);


    List<User> selAllUser();

    void delById(@Param("id") Integer id);

    void insertUser(@Param("user") User user);


}
