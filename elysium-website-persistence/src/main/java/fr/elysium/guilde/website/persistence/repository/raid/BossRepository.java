package fr.elysium.guilde.website.persistence.repository.raid;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.raid.Boss;

/**
 * <b>BossRepository</b> Data Access Class for bosses
 * 
 * @author Meidi
 *
 */
public interface BossRepository extends JpaRepository<Boss, Long> {

}
