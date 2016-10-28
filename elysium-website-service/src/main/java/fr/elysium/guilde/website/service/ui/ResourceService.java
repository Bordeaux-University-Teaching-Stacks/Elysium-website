package fr.elysium.guilde.website.service.ui;

import java.util.List;

import fr.elysium.guilde.website.service.dto.ui.ResourceDTO;

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
  List<ResourceDTO> listMainResources(int idGroup);

}
