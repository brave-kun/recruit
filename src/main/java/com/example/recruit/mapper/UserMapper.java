package com.example.recruit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.recruit.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
