package fr.elysium.guilde.website.persistence.repository.acl;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.acl.Player;

/**
 * <b>PlayerRepository</b> Data Access Class for Players
 * 
 * @author Meidi
 *
 */
public interface PlayerRepository extends JpaRepository<Player, Long>{

}
