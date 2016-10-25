package fr.elysium.guilde.website.persistence.repository.avatar;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.avatar.Role;

/**
 * <b>RoleRepository</b> Data Access Class for Roles
 * 
 * @author Meidi
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

}
