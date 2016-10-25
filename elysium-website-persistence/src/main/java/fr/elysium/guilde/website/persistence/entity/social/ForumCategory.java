package fr.elysium.guilde.website.persistence.entity.social;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

/**
 * <b>ForumCategory</b> stands for the different categories of the forum
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_FORUMS_CATEGORIES")
public class ForumCategory {

  /**
   * Forum category unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_FORUM_CATEGORY")
  private long id;

  /**
   * Category name
   */
  @Column(name = "FORUM_CATEGORY_NAME", nullable = false, length = 100)
  private String name;

  /**
   * Category short description
   */
  @Column(name = "FORUM_CATEGORY_DESCRIPTION", nullable = true, length = 255)
  private String description;

  /**
   * Category forum
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FORUM")
  private Forum forum;

  /**
   * The list of posts for this category
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FORUM_CATEGORY")
  @OrderBy("FORUM_POST_UPDATE_DATE DESC, FORUM_POST_CREATION_DATE DESC")
  private List<ForumPost> posts;

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * @return the forum
   */
  public Forum getForum() {
    return forum;
  }

  /**
   * @param forum the forum to set
   */
  public void setForum(Forum forum) {
    this.forum = forum;
  }

  /**
   * @return the posts
   */
  public List<ForumPost> getPosts() {
    return posts;
  }

  /**
   * @param posts the posts to set
   */
  public void setPosts(List<ForumPost> posts) {
    this.posts = posts;
  }

}
