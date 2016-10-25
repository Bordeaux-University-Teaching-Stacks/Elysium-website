package fr.elysium.guilde.website.persistence.entity.media;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * <b>Blog</b> is the blog specialization of Article
 * 
 * @author Meidi
 * 
 */
@Entity
@DiscriminatorValue("BLOG")
public class Blog extends Article {

}
