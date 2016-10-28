package fr.elysium.guilde.website.service.media;

import java.util.List;

import fr.elysium.guilde.website.persistence.entity.media.Article;

/**
 * <b>ArticleService</b>
 * 
 * @author Meidi
 *
 */
public interface ArticleService {

  /**
   * List last articles
   * 
   * @param nbNews : number of news
   * @return
   */
  List<Article> listLastNews(int nbNews);

}
