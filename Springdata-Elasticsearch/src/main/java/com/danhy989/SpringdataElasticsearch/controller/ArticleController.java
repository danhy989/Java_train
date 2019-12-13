package com.danhy989.SpringdataElasticsearch.controller;

import com.danhy989.SpringdataElasticsearch.dto.Author;
import com.danhy989.SpringdataElasticsearch.entities.Article;
import com.danhy989.SpringdataElasticsearch.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

@RestController
@RequestMapping(value = "/article")
public class ArticleController {
    private  ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService){
        this.articleService = articleService;
    }

    @GetMapping("/create")
    public Article create() throws IOException {
        Article article = new Article("Spring Data Elasticsearch");
        article.setAuthors(asList(new Author("John Smith"), new Author("John Doe")));
        articleService.save(article);
        return article;
    }

    @GetMapping("/find/author/name")
    public List<Article> findByAuthorName() throws IOException {
        String nameToFind = "John";
        Page<Article> articleByAuthorName= articleService.findByAuthorName(nameToFind, PageRequest.of(0, 10));
        return articleByAuthorName.get().collect(Collectors.toList());
    }
}
