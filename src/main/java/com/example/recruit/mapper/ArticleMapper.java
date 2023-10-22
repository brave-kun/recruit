package com.example.recruit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.recruit.entity.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
