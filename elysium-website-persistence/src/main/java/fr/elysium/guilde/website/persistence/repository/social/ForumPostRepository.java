package fr.elysium.guilde.website.persistence.repository.social;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.social.ForumPost;

/**
 * <b>ForumPostRepository</b> Data Access Class for Forums posts
 * 
 * @author Meidi
 *
 */
public interface ForumPostRepository extends JpaRepository<ForumPost, Long> {

}
