package fr.elysium.guilde.website.business.service.ui;

import java.util.List;

import fr.elysium.guilde.website.persistence.entity.acl.Group;
import fr.elysium.guilde.website.persistence.entity.ui.Resource;

/**
 * <b>ResourceBusinessService</b> describe the Resources business rules
 * 
 * @author Meidi
 *
 */
public interface ResourceBusinessService {

  /**
   * List all of the resources of the current user group
   * 
   * @return
   */
  List<Resource> listMainMenu(Group group);
}
