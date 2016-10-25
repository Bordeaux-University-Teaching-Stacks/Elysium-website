package fr.elysium.guilde.website.persistence.repository.social;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.social.Forum;

/**
 * <b>ForumRepository</b> Data Access Class for Forums
 * 
 * @author Meidi
 *
 */
public interface ForumRepository extends JpaRepository<Forum, Long> {

}
