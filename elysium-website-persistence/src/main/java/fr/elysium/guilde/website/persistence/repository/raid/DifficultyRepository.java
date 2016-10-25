package fr.elysium.guilde.website.persistence.repository.raid;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.raid.Difficulty;

/**
 * <b>DifficultyRepository</b> Data Access Class for Difficulties
 * 
 * @author Meidi
 *
 */
public interface DifficultyRepository extends JpaRepository<Difficulty, Integer> {

}
