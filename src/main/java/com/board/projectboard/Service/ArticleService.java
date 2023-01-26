package com.board.projectboard.Service;

import com.board.projectboard.ArticleDto;
import com.board.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public List<ArticleDto> getArticles(int cursor){
        List<ArticleDto> articleList = new ArrayList<>();
        return articleList;
    }

}
