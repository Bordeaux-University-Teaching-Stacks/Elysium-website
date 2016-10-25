package fr.elysium.guilde.website.persistence.repository.avatar;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.avatar.Region;

/**
 * <b>RegionRepository</b> Data Access Class for Regions
 * 
 * @author Meidi
 *
 */
public interface RegionRepository extends JpaRepository<Region, Integer> {

}
