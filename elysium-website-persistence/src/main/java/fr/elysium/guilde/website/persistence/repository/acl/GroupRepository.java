package fr.elysium.guilde.website.persistence.repository.acl;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.acl.Group;

/**
 * <b>GroupRepository</b> Data Access Class for Groups
 * 
 * @author Meidi
 *
 */
public interface GroupRepository extends JpaRepository<Group, Integer> {

}
