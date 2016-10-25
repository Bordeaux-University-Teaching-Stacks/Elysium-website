package fr.elysium.guilde.website.persistence.repository.avatar;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.avatar.Faction;

/**
 * <b>FactionRepository</b> Data Access Class for Factions
 * 
 * @author Meidi
 *
 */
public interface FactionRepository extends JpaRepository<Faction, Integer> {

}
