package com.example.recruit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 功能： 关于文章的实体类
 * 作者： bravekun
 * 日期： 2023/10/19 15:17
 */

@Data
public class Article {
    @TableId(value = "article_id", type = IdType.AUTO)
    private Integer articleId;
    private String title;
    private String author;
    //private String token;

    @Override
    public String toString() {
        return "Article{" +
                "article_id=" + articleId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}