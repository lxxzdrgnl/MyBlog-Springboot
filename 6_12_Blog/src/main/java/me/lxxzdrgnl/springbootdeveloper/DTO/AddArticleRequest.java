package me.lxxzdrgnl.springbootdeveloper.DTO;

import me.lxxzdrgnl.springbootdeveloper.domain.Article;

public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntity() {
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
