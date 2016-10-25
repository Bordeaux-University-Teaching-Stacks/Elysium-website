package fr.elysium.guilde.website.persistence.repository.raid;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.raid.Patch;

/**
 * <b>PatchRepository</b> Data Access Class for Patches
 * 
 * @author Meidi
 *
 */
public interface PatchRepository extends JpaRepository<Patch, Long> {

}
