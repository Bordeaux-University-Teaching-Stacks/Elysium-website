package fr.elysium.guilde.website.business.service.ui;

import java.util.List;

import fr.elysium.guilde.website.persistence.entity.ui.Resource;

/**
 * <b>ResourceService</b>
 * 
 * @author Meidi
 *
 */
public interface ResourceService {

  /**
   * List all the resources for a given group
   * 
   * @return
   */
  List<Resource> listMainResources(int idGroup);

}
