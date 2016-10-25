package fr.elysium.guilde.website.persistence.repository.raid;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.raid.Achievement;

/**
 * <b>AchievementRepository</b> Data Access Class for Achivements
 * 
 * @author Meidi
 *
 */
public interface AchievementRepository extends JpaRepository<Achievement, Long> {

}
