package fr.elysium.guilde.website.persistence.repository.acl;

import java.util.Date;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import fr.elysium.guilde.website.persistence.entity.acl.Group;
import fr.elysium.guilde.website.persistence.entity.acl.Player;
import fr.elysium.guilde.website.persistence.repository.acl.PlayerRepository;
import fr.elysium.guilde.website.persistence.util.AbstractRepositoryTest;

public class PlayerRepositoryTest extends AbstractRepositoryTest<PlayerRepository, Player, Long> {

	private static final String PLAYER_TO_CREATE_PASSWORD = "playerPassword";
	private static final String PLAYER_TO_CREATE_EMAIL = "playerEmail";
	private static final String PLAYER_TO_CREATE_SURNAME = "playerSurname";
	private static final String PLAYER_TO_CREATE_NICKNAME = "playerNickname";
	private static final String PLAYER_TO_CREATE_NAME = "playerName";
	private static final long PLAYER_TO_FIND_ID = 1L;

	@Autowired
	private PlayerRepository playerRepository;
	
	@Before
	public void setUpTests() {
		this.id = PLAYER_TO_FIND_ID;
		this.entity = new Player();
		this.entity.setName(PLAYER_TO_CREATE_NAME);
		this.entity.setSurname(PLAYER_TO_CREATE_SURNAME);
		this.entity.setNickname(PLAYER_TO_CREATE_NICKNAME);
		this.entity.setEmail(PLAYER_TO_CREATE_EMAIL);
		this.entity.setPassword(PLAYER_TO_CREATE_PASSWORD);
		this.entity.setBirth(new Date());
		this.entity.setGroup(new Group(1));
	}

}
