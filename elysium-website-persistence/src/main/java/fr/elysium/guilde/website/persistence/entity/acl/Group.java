package fr.elysium.guilde.website.persistence.entity.acl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.elysium.guilde.website.persistence.entity.media.Article;
import fr.elysium.guilde.website.persistence.entity.social.Forum;
import fr.elysium.guilde.website.persistence.entity.ui.Resource;

/**
 * <b>Group</b> regroup users with same permissions
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_GROUPS")
public class Group {

  /**
   * Group unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_GROUP")
  private int id;

  /**
   * Group name
   */
  @Column(name = "GROUP_NAME", nullable = false, length = 50)
  private String name;

  /**
   * Group resources
   */
  @ManyToMany(mappedBy = "groups", fetch = FetchType.LAZY)
  private List<Resource> resources;

  /**
   * Group articles
   */
  @ManyToMany(mappedBy = "groups", fetch = FetchType.LAZY)
  private List<Article> articles;

  /**
   * Group forums
   */
  @ManyToMany(mappedBy = "groups", fetch = FetchType.LAZY)
  private List<Forum> forums;

  /**
   * Group users
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_USER")
  private List<User> users = new ArrayList<User>();

  /**
   * Implicit constructor
   */
  public Group() {};
  
  /**
   * Explicit constructor
   * @param id
   */
  public Group(int id) {
	this.id = id;
  }

/**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
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
   * @return the resources
   */
  public List<Resource> getResources() {
    return resources;
  }

  /**
   * @param resources the resources to set
   */
  public void setResources(List<Resource> resources) {
    this.resources = resources;
  }

  /**
   * @return the articles
   */
  public List<Article> getArticles() {
    return articles;
  }

  /**
   * @param articles the articles to set
   */
  public void setArticles(List<Article> articles) {
    this.articles = articles;
  }

  /**
   * @return the forums
   */
  public List<Forum> getForums() {
    return forums;
  }

  /**
   * @param forums the forums to set
   */
  public void setForums(List<Forum> forums) {
    this.forums = forums;
  }

  /**
   * @return the users
   */
  public List<User> getUsers() {
    return users;
  }

  /**
   * @param users the users to set
   */
  public void setUsers(List<User> users) {
    this.users = users;
  }

}
