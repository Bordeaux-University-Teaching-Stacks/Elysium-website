package fr.elysium.guilde.website.business.service.media.impl;

import static org.junit.Assert.assertTrue;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.elysium.guilde.website.business.service.util.AbstractBusinessServiceTest;
import fr.elysium.guilde.website.service.media.ArticleService;

public class ArticleBusinessServiceTest extends AbstractBusinessServiceTest {

	private static final int NB_NEWS = 1;
	
	@Autowired
	private ArticleService articleService;
	
	@Test
	public void testListLastNews() {
		assertTrue(CollectionUtils.isNotEmpty(articleService.listLastNews(NB_NEWS)));
	}

}
