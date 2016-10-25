package fr.elysium.guilde.website.persistence.repository.avatar;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.avatar.Specialization;

/**
 * <b>SpecializationRepository</b> Data Access Class for Specializations
 * 
 * @author Meidi
 *
 */
public interface SpecializationRepository extends JpaRepository<Specialization, Long> {

}
