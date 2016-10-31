package fr.elysium.guilde.website.persistence.repository.media;

import java.util.Date;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import fr.elysium.guilde.website.persistence.entity.acl.Player;
import fr.elysium.guilde.website.persistence.entity.acl.User;
import fr.elysium.guilde.website.persistence.entity.media.News;
import fr.elysium.guilde.website.persistence.util.AbstractRepositoryTest;

public class NewsRepositoryTest extends AbstractRepositoryTest<NewsRepository, News, Long>{

	private static final String NEWS_TO_CREATE_TITLE = "newsToCreateTitle";
	private static final String NEWS_TO_CREATE_PREVIEW = "newsToCreatePreview";
	private static final String NEWS_TO_CREATE_CONTENT = "newsToCreateContent";
	private static final long NEWS_TO_CREATE_AUTHOR_ID = 1L;
	private static final long NEWS_TO_FIND_ID = 1L;
	private final User player = new Player();
	
	@Autowired
	private NewsRepository newsRepository;
	
	@Before
	public void setUpTests() {
		this.id = NEWS_TO_FIND_ID;
		this.player.setId(NEWS_TO_CREATE_AUTHOR_ID);
		this.entity = new News();
		this.entity.setAuthor(this.player);
		this.entity.setContent(NEWS_TO_CREATE_CONTENT);
		this.entity.setCoverageImage("");
		this.entity.setDateCreate(new Date());
		this.entity.setDateUpdate(new Date());
		this.entity.setHeaderImage("");
		this.entity.setIllustration("");
		this.entity.setPreview(NEWS_TO_CREATE_PREVIEW);
		this.entity.setTitle(NEWS_TO_CREATE_TITLE);
	}

}
