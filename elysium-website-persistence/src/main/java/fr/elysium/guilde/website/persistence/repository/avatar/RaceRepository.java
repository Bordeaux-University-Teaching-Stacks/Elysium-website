package fr.elysium.guilde.website.persistence.repository.avatar;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.avatar.Race;

/**
 * <b>RaceRepository</b> Data Access Class for Races
 * 
 * @author Meidi
 *
 */
public interface RaceRepository extends JpaRepository<Race, Integer> {

}
