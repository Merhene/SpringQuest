package org.wildcodeschool.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.myproject.model.Article;

import java.time.LocalDateTime;
import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

      List<Article> findByTitle(String title);
      List<Article> findByContentContaining(String content);
      List<Article> findByCreatedAtAfter(LocalDateTime date);
      List<Article> findLastsByCreatedAtDesc();
}
