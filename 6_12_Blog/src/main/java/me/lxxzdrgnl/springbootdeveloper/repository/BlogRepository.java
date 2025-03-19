package me.lxxzdrgnl.springbootdeveloper.repository;

import me.lxxzdrgnl.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public class BlogRepository {
    public interface BlogRepositoryInterface extends JpaRepository<Article, Long>{

    }
}
