package com.example.recruit.entity;

import lombok.Data;

/**
 * 功能： 关于用户的实体类
 * 作者： bravekun
 * 日期： 2023/10/20 19:33
 */

@Data
public class User {

    private Integer id;
    private String username;
    private String password;
}
