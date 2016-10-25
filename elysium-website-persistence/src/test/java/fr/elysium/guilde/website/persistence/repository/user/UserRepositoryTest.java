package fr.elysium.guilde.website.persistence.repository.user;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.elysium.guilde.website.persistence.repository.acl.UserRepository;
import fr.elysium.guilde.website.persistence.util.AbstractRepositoryTest;

public class UserRepositoryTest extends AbstractRepositoryTest {

  private static final long PLAYER_TO_FIND_ID = 1L;

  @Autowired
  private UserRepository userRepository;

  @Test
  public void testReadPlayer() {
    assertNotNull(userRepository.findOne(PLAYER_TO_FIND_ID));
  }

}
