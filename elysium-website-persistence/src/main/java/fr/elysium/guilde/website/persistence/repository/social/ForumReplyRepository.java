package fr.elysium.guilde.website.persistence.repository.social;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.social.ForumReply;

/**
 * <b>ForumReplyRepository</b> Data Access Class for Forum replies
 * 
 * @author Meidi
 *
 */
public interface ForumReplyRepository extends JpaRepository<ForumReply, Long> {

}
