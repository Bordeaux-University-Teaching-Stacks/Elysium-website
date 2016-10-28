package fr.elysium.guilde.website.business.service.ui.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.elysium.guilde.website.business.service.ui.ArticleBusinessService;
import fr.elysium.guilde.website.persistence.entity.media.Article;
import fr.elysium.guilde.website.service.media.ArticleService;

/**
 * <b>ArticleBusinessServiceImpl</b> implementation of ArticleBusinessService
 * 
 * @author Meidi
 *
 */
@Service("ArticleBusinessService")
public class ArticleBusinessServiceImpl implements ArticleBusinessService {

  @Autowired
  private ArticleService articleService;

  /**
   * {@inheritDoc}
   */
  @Override
  public List<Article> listLastNews(int nbNews) {
    return articleService.listLastNews(nbNews);
  }

}
