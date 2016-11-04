package fr.elysium.guilde.website.service.ui.impl;

import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.elysium.guilde.website.commons.utils.DozerUtils;
import fr.elysium.guilde.website.persistence.repository.ui.ResourceRepository;
import fr.elysium.guilde.website.service.dto.ui.ResourceDTO;
import fr.elysium.guilde.website.service.ui.ResourceService;

/**
 * <b>ResourceServiceImpl</b> implementation of <b>ResourceService</b>
 * 
 * @author Meidi
 *
 */
@Service("ResourceService")
@Transactional
public class ResourceServiceImpl implements ResourceService {

  @Autowired
  private Mapper mapper;

  @Autowired
  private ResourceRepository resourceRepository;

  /**
   * {@inheritDoc}
   */
  @Transactional(readOnly=true)
  @Override
  public List<ResourceDTO> listMainResources(int idGroup) {
    return DozerUtils.map(mapper, resourceRepository.findByGroupsIdOrderByAppearanceOrderAsc(idGroup), ResourceDTO.class);
  }

}
