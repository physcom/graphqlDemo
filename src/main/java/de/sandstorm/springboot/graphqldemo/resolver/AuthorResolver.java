package de.sandstorm.springboot.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import de.sandstorm.springboot.graphqldemo.model.Article;
import de.sandstorm.springboot.graphqldemo.model.Author;
import de.sandstorm.springboot.graphqldemo.repository.ArticleRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorResolver implements GraphQLResolver<Author> {
    private final ArticleRepository articleRepository;

    public AuthorResolver(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
    public List<Article> getArticles(Author author) {
        return articleRepository.findAllByAuthorId(author.getId());
    }
}
