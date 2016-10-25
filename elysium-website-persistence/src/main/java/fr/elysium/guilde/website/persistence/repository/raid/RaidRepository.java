package fr.elysium.guilde.website.persistence.repository.raid;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.raid.Raid;

/**
 * <b>RaidRepository</b> Data Access Class for Raids
 * 
 * @author Meidi
 *
 */
public interface RaidRepository extends JpaRepository<Raid, Long> {

}
