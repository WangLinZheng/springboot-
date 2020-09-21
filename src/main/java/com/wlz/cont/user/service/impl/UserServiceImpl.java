package com.wlz.cont.user.service.impl;

import com.wlz.cont.user.dao.UserDao;
import com.wlz.cont.user.pojo.User;
import com.wlz.cont.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao ud;


    @Override
    public List<User> getAllUser(Map map) {
        return ud.getAllUser(map);
    }

    @Override
    public void delById(Integer id) {
        ud.delById(id);
    }

    @Override
    public void insertUser(User user) {
        ud.insertUser(user);
    }


}
