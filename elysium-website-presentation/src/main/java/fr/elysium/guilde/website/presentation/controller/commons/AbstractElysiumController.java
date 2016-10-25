package fr.elysium.guilde.website.presentation.controller.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.elysium.guilde.website.persistence.entity.acl.Group;
import fr.elysium.guilde.website.persistence.entity.acl.User;
import fr.elysium.guilde.website.persistence.entity.acl.enums.GroupEnum;
import fr.elysium.guilde.website.presentation.controller.portal.session.UserSession;

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
   * User in session
   */
  protected User currentUser = new UserSession(new Group(GroupEnum.GUEST.getKey()));

}
