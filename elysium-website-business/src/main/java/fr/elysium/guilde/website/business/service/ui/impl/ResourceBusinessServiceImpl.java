package fr.elysium.guilde.website.business.service.ui.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.elysium.guilde.website.business.service.ui.ResourceBusinessService;
import fr.elysium.guilde.website.business.service.ui.ResourceService;
import fr.elysium.guilde.website.persistence.entity.acl.Group;
import fr.elysium.guilde.website.persistence.entity.ui.Resource;

/**
 * <b>ResourceBusinessServiceImpl</b> implements the ResourceBusinessService
 * 
 * @author Meidi
 *
 */
@Service("ResourceBusinessService")
public class ResourceBusinessServiceImpl implements ResourceBusinessService {

  @Autowired
  private ResourceService resourceService;

  /**
   * {@inheritDoc}
   */
  @Override
  public List<Resource> listMainMenu(Group group) {
    return resourceService.listMainResources(group.getId());
  }

}
