package fr.elysium.guilde.website.presentation.controller.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

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
  protected User currentUser;

  /**
   * Page to display
   */
  protected ModelAndView page;

  /**
   * Init the currentUser to GUEST if not authentified
   */
  @ModelAttribute
  public void initCurrentUser() {
    if (this.currentUser == null) {
      this.currentUser = new UserSession(new Group(GroupEnum.GUEST.getKey()));
    }
  }

}
