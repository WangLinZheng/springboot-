package com.wlz.cont.user.service;


import com.wlz.cont.user.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> getAllUser(Map map);

    void delById(Integer id);

    void insertUser(@Param("user") User user);

}
