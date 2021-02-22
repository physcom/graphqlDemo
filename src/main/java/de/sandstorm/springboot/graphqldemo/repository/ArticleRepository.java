package de.sandstorm.springboot.graphqldemo.repository;

import de.sandstorm.springboot.graphqldemo.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findAllByAuthorId(Long authorId);
}
