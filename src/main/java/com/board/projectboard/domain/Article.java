package com.board.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title; // 제목
    private String content; // 본문
    private String hashtag; // 해시태그

    private LocalDateTime createdAt; // 수정일시
    private String createdBy; // 수정자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
