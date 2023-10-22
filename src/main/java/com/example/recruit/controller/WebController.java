package com.example.recruit.controller;

import com.example.recruit.common.Result;
import com.example.recruit.entity.User;
import com.example.recruit.service.UserService;
import com.example.recruit.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能： 用户登录
 * 作者： bravekun
 * 日期： 2023/10/19 15:16
 */

@RestController
public class WebController {
    @Autowired
    UserService userService;

    /**
     * 实现用户登录才能进行文章的相关操作
     */
    @GetMapping("/login")
    public Result login(@RequestBody User user) {
        try {
            User userDB = userService.login(user.getUsername(), user.getPassword());
            Map<String, String> payload = new HashMap<>();
            payload.put("username", userDB.getUsername());
            //生成JWT的令牌
            String token = JWTUtils.getToken(payload);
            return Result.success(token);
        } catch (Exception e){
            return Result.error();
        }
    }


}
