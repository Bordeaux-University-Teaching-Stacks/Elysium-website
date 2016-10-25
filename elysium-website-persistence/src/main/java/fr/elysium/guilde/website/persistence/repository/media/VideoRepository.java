package fr.elysium.guilde.website.persistence.repository.media;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.media.Video;

/**
 * <b>VideoRepository</b> Data Access Class for Videos
 * 
 * @author Meidi
 *
 */
public interface VideoRepository extends JpaRepository<Video, Long> {

}
