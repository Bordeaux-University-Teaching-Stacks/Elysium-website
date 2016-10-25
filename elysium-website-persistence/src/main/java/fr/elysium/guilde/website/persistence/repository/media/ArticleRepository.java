package fr.elysium.guilde.website.persistence.repository.media;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.media.Article;

/**
 * <b>ArticleRepository</b> Data Access Class for Articles
 * 
 * @author Meidi
 *
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
