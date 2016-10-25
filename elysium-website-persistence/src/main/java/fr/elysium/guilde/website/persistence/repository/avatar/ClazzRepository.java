package fr.elysium.guilde.website.persistence.repository.avatar;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.avatar.Clazz;

/**
 * <b>ClazzRepository</b> Data Access Class for Classes
 * 
 * @author Meidi
 *
 */
public interface ClazzRepository extends JpaRepository<Clazz, Long> {

}
