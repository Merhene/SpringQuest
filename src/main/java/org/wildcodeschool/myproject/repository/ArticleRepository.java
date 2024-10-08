package org.wildcodeschool.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.myproject.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
