package fr.elysium.guilde.website.business.service.ui.impl;

import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.elysium.guilde.website.business.bo.ui.ResourceBO;
import fr.elysium.guilde.website.business.service.ui.ResourceBusinessService;
import fr.elysium.guilde.website.commons.utils.DozerUtils;
import fr.elysium.guilde.website.persistence.entity.acl.Group;
import fr.elysium.guilde.website.service.ui.ResourceService;

/**
 * <b>ResourceBusinessServiceImpl</b> implements the ResourceBusinessService
 * 
 * @author Meidi
 *
 */
@Service("ResourceBusinessService")
public class ResourceBusinessServiceImpl implements ResourceBusinessService {

  @Autowired
  private Mapper mapper;

  @Autowired
  private ResourceService resourceService;

  /**
   * {@inheritDoc}
   */
  @Override
  public List<ResourceBO> listMainMenu(Group group) {
    return DozerUtils.map(mapper, resourceService.listMainResources(group.getId()), ResourceBO.class);
  }

}
