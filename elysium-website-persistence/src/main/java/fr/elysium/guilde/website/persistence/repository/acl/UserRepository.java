package fr.elysium.guilde.website.persistence.repository.acl;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.acl.User;

/**
 * <b>UserRepository</b> Data Access Class for Users
 * 
 * @author Meidi
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
