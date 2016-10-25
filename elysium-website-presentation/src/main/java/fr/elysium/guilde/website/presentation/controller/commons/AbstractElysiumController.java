package fr.elysium.guilde.website.presentation.controller.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;

import fr.elysium.guilde.website.persistence.entity.acl.Player;
import fr.elysium.guilde.website.persistence.entity.acl.User;

/**
 * Commons controllers actions
 * 
 * @author Meidi
 *
 */
public abstract class AbstractElysiumController {
  
  /**
   * Logger
   */
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  /**
   * Generate guest user if not authenticated
   * 
   * @param currentUser
   * @return
   */
  @ModelAttribute("currentUser")
  public User setCurrentUserIfNotExists(@ModelAttribute("currentUser") User currentUser) {
    if (currentUser == null) return new Player();
    return currentUser;
  }
}
