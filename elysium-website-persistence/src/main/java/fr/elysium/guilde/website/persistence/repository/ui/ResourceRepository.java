package fr.elysium.guilde.website.persistence.repository.ui;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.ui.Resource;

/**
 * <b>ResourceRepository</b> Data Access Class for Resources
 * 
 * @author Meidi
 *
 */
public interface ResourceRepository extends JpaRepository<Resource, Long> {

  /**
   * Finds resources linked to a group id
   * 
   * @param idGroup
   * @return
   */
  List<Resource> findByGroupsIdOrderByAppearanceOrderAsc(int idGroup);

}
