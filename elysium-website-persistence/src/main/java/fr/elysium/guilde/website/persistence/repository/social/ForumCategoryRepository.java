package fr.elysium.guilde.website.persistence.repository.social;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.social.ForumCategory;

/**
 * <b>ForumCategoryRepository</b> Data Access Class for Forums categories
 * 
 * @author Meidi
 *
 */
public interface ForumCategoryRepository extends JpaRepository<ForumCategory, Long> {

}
