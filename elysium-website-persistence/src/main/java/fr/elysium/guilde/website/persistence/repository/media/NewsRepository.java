package fr.elysium.guilde.website.persistence.repository.media;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.media.News;

/**
 * <b>NewsRepository</b> Data Access Class for News
 * 
 * @author Meidi
 *
 */
public interface NewsRepository extends JpaRepository<News, Long>{

}
