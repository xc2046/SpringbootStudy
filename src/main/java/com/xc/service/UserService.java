package com.xc.service;

import com.xc.dao.UserRepositoty;
import com.xc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xc on 2017/8/9.
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoty dao;

    public User findUserByName(String name){

        User user = null;
        User byUserName = dao.findByUserName(name);

        return byUserName;
    }

}
