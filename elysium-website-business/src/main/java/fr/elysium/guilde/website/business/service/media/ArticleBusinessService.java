package fr.elysium.guilde.website.business.service.media;

import java.util.List;

import fr.elysium.guilde.website.persistence.entity.media.Article;

/**
 * <b>ArticleBusinessService</b> for articles business rules
 * 
 * @author Meidi
 *
 */
public interface ArticleBusinessService {

  /**
   * List last news
   * 
   * @param nbNews : number of news
   * @return
   */
  List<Article> listLastNews(int nbNews);

}
