package fr.elysium.guilde.website.service.media;

import static org.junit.Assert.*;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.elysium.guilde.website.service.util.AbstractServiceTest;

public class ArticleServiceTest extends AbstractServiceTest {
	
	@Autowired
	private ArticleService articleService;

	@Test
	public void testListLastNews() {
		assertTrue(CollectionUtils.isNotEmpty(articleService.listLastNews(1)));
	}

}
