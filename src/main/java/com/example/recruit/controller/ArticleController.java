package com.example.recruit.controller;

import com.example.recruit.common.Result;
import com.example.recruit.entity.Article;
import com.example.recruit.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 功能： 有关文章的操作
 * 作者： bravekun
 * 日期： 2023/10/19 15:16
 */

@CrossOrigin
@RestController
@RequestMapping("/login")
public class ArticleController {

    @Resource
    ArticleService articleService;

    /**
     * 查询全部文章信息
     */
    @GetMapping("/selectAll")
    public Result getArticleList() {
        List<Article> articleList = articleService.getArticleList();
        return Result.success(articleList);
    }


    /**
     * 根据id查询文章
     */
    @GetMapping("/select/{articleId}")
    public Result getArticleById(@PathVariable Integer articleId) {
        Article articleById = articleService.getArticleById(articleId);
        return Result.success(articleById);
    }


    /**
     * 新增文章
     */
    @PostMapping("/add")
    public Result addArticle(@RequestBody Article article) {
        articleService.addArticle(article);
        return Result.success();
    }


    /**
     * 更新文章信息
     */
    @PutMapping("/update")
    public Result updateArticle(@RequestBody Article article) {
        articleService.updateArticle(article);
        return Result.success();
    }


    /**
     * 根据id删除文章
     */
    @DeleteMapping("/delete/{articleId}")
    public Result delArticleById(@PathVariable Integer articleId) {
        articleService.delArticleById(articleId);
        return Result.success();
    }

}
