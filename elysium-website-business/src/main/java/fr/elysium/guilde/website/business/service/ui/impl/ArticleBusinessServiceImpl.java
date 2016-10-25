package fr.elysium.guilde.website.business.service.ui.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.elysium.guilde.website.business.service.ui.ArticleBusinessService;
import fr.elysium.guilde.website.persistence.entity.media.Article;

/**
 * <b>ArticleBusinessServiceImpl</b> implementation of ArticleBusinessService
 * 
 * @author Meidi
 *
 */
public class ArticleBusinessServiceImpl implements ArticleBusinessService {

  @Autowired
  private ArticleService articleService;

  /**
   * {@inheritDoc}
   */
  @Override
  public List<Article> listLastNews() {
    return articleService.listLastNews();
  }

}
