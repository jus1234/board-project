package com.board.projectboard.controller;

import com.board.projectboard.ArticleDto;
import com.board.projectboard.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/list")
    public ResponseEntity<ArticleDto> getArticleList(
            @RequestParam int cursor
    ){
        List<ArticleDto> articleDtoList = articleService.getArticles(cursor);

        return new ResponseEntity<>();
    }

}
