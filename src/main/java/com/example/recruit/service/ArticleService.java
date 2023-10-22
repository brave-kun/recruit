package com.example.recruit.service;

import com.example.recruit.entity.Article;
import com.example.recruit.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能：
 * 作者： bravekun
 * 日期： 2023/10/19 15:17
 */

@Service
public class ArticleService {

    @Autowired
    ArticleMapper articleMapper;


    public List<Article> getArticleList() {
        return articleMapper.selectList(null);
    }

    public Article getArticleById(Integer articleId) {
        return articleMapper.selectById(articleId);
    }

    public void addArticle(Article article) {
        articleMapper.insert(article);
    }

    public int updateArticle(Article article) {
        return articleMapper.updateById(article);
    }

    public int delArticleById(Integer articleId) {
        return articleMapper.deleteById(articleId);
    }
}
