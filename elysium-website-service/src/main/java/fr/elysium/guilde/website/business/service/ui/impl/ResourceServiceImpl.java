package fr.elysium.guilde.website.business.service.ui.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.elysium.guilde.website.business.service.ui.ResourceService;
import fr.elysium.guilde.website.persistence.entity.ui.Resource;
import fr.elysium.guilde.website.persistence.repository.ui.ResourceRepository;

/**
 * <b>ResourceServiceImpl</b> implementation of <b>ResourceService</b>
 * 
 * @author Meidi
 *
 */
@Service("ResourceService")
public class ResourceServiceImpl implements ResourceService {

  @Autowired
  private ResourceRepository resourceRepository;

  /**
   * {@inheritDoc}
   */
  @Override
  public List<Resource> listMainResources(int idGroup) {
    return resourceRepository.findByGroupId(idGroup);
  }

}
