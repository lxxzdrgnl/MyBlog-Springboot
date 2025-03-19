package me.lxxzdrgnl.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.lxxzdrgnl.springbootdeveloper.DTO.AddArticleRequest;
import me.lxxzdrgnl.springbootdeveloper.domain.Article;
import me.lxxzdrgnl.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
