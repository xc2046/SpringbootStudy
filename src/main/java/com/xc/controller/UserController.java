package com.xc.controller;

import com.xc.dao.UserRepositoty;
import com.xc.pojo.User;
import com.xc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by xc on 2017/8/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @Autowired
    private UserRepositoty dao;

    @RequestMapping("/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping("/show")
    @ResponseBody
    public String show(@RequestParam(value = "name") String name){
        User user = service.findUserByName(name);
        if (null!=user){
            return user.getId()+"/"+user.getName()+"/"+user.getPassword();
        }
        return null;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<User> list(){
        List<User> userList = dao.findAll();
        return userList;
    }

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    @ResponseBody
    public User save(User user){
        return dao.save(user);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    @ResponseBody
    public List<User> delete(Long id){
        dao.delete(id);
        List<User> userList = dao.findAll();
        return dao.save(userList);
    }

}
