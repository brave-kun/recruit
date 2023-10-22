package com.example.recruit.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.recruit.entity.User;
import com.example.recruit.mapper.UserMapper;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能：
 * 作者： bravekun
 * 日期： 2023/10/20 19:37
 */

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User login(String username, String password) {
        //根据接收的用户名密码查询数据库中是否存在
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username)
                .eq("password", password);
        User userDB = userMapper.selectOne(queryWrapper);

        if (userDB != null) {
            return userDB;
        }
        throw new RuntimeException("登陆失败");

    }
}
