package fr.elysium.guilde.website.persistence.entity.social;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import fr.elysium.guilde.website.persistence.entity.acl.Group;

/**
 * <b>Forum</b> stands for the different forums of the forum page
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_FORUMS")
public class Forum {

  /**
   * Forum unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_FORUM")
  private long id;

  /**
   * Forum name
   */
  @Column(name = "FORUM_NAME", nullable = false, length = 100)
  private String name;

  /**
   * Forum short description
   */
  @Column(name = "FORUM_DESCRIPTION", nullable = true, length = 255)
  private String description;

  /**
   * The list of groups seeing this forum
   */
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "TA_FORUMS_GROUPS", joinColumns = @JoinColumn(name = "TA_FORUMS_ID_FORUM", referencedColumnName = "ID_FORUM"), inverseJoinColumns = @JoinColumn(name = "TA_GROUPS_ID_GROUP", referencedColumnName = "ID_GROUP"))
  private List<Group> groups = new ArrayList<Group>();

  /**
   * Forum Categories
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FORUM")
  @OrderBy("FORUM_CATEGORY_NAME ASC")
  private List<ForumCategory> categories = new ArrayList<ForumCategory>();

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
   * @return the groups
   */
  public List<Group> getGroups() {
    return groups;
  }

  /**
   * @param groups the groups to set
   */
  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  /**
   * @return the categories
   */
  public List<ForumCategory> getCategories() {
    return categories;
  }

  /**
   * @param categories the categories to set
   */
  public void setCategories(List<ForumCategory> categories) {
    this.categories = categories;
  }

}
