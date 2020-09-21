package com.wlz.cont.user.controller;

import com.wlz.cont.user.pojo.User;
import com.wlz.cont.user.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService us;

//    @ResponseBody返回json数据
    @GetMapping("/ll")
    @ResponseBody
    @ApiOperation("获取所有用户")
    public List<User> getAll(Map map){

        return us.getAllUser(map);
    }

    @RequestMapping("/findall")
    public String abc(Model model , Map map){
        List<User> ulist = us.getAllUser(map);
        model.addAttribute("users" , ulist);
        return "users";
    }

    @RequestMapping("/del")
    @ResponseBody
    public String del(Integer id){
        System.out.println(id);
        us.delById(id);
        return "users";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(User user){
//        user.setAccount("十多万");
//        user.setId(15);
//        user.setCreattime("2020-06-05");
//        user.setPwd("123465");
//        user.setStatus(1);
        System.out.println( user.toString());
        us.insertUser(user);
        return "users";
    }
}
