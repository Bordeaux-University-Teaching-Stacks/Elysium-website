package fr.elysium.guilde.website.service.media.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.elysium.guilde.website.persistence.entity.media.Article;
import fr.elysium.guilde.website.persistence.repository.media.ArticleRepository;
import fr.elysium.guilde.website.service.media.ArticleService;

/**
 * <b>ArticleServiceImpl</b> implementation of ArticleService
 * 
 * @author Meidi
 *
 */
@Service("ArticleService")
@Transactional
public class ArticleServiceImpl implements ArticleService {

  @Autowired
  private ArticleRepository articleRepository;

  /**
   * {@inheritDoc}
   */
  @Transactional(readOnly=true)
  @Override
  public List<Article> listLastNews(int nbNews) {
    Pageable nbNewsLimit = new PageRequest(0, nbNews);
    return this.articleRepository.findAll(nbNewsLimit).getContent();
  }

}
