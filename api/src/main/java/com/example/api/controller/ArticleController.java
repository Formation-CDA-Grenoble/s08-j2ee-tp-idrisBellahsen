package com.example.api.controller;

import java.util.List;

import javax.validation.Valid;

import com.example.api.model.Article;
import com.example.api.repository.ArticleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;



@RestController
@RequestMapping("/api/articles")
@CrossOrigin
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("")
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }


    @PostMapping("")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Article createArticle(@Valid @RequestBody Article article) {
        return articleRepository.save(article);
    }

    @PutMapping("/{id}")
    public Article updateArticle(@PathVariable(value = "id") Long articleId, @Valid @RequestBody Article newArticle) {

        Article article = this.fetchArticle(articleId);
 
        article.setTitle(newArticle.getTitle());
        article.setContent(newArticle.getContent());
 
        return articleRepository.save(article);
    }

    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable(value = "id") Long articleId) {
        return this.fetchArticle(articleId);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteArticle(@PathVariable(value = "id") Long articleId) {
        Article article = this.fetchArticle(articleId);
        articleRepository.delete(article);
    }

    public Article fetchArticle(Long articleId) {
        Article article = articleRepository.findById(articleId).orElseThrow(
            () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Article not found")
        );
        return article;
    }
}
