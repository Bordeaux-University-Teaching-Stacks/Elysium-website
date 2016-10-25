package fr.elysium.guilde.website.persistence.entity.ui;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import fr.elysium.guilde.website.persistence.entity.acl.Group;

/**
 * <b>Resource</b> describe a menu link
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_RESOURCES")
public class Resource {

  /**
   * Resource unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_RESOURCE", unique = true, nullable = false)
  private long id;

  /**
   * Resource name
   */
  @Column(name = "RESOURCE_NAME", nullable = false, length = 50)
  private String name;

  /**
   * Resource path to go on click
   */
  @Column(name = "RESOURCE_URI", nullable = false, length = 255)
  private String uri;

  /**
   * Resource order of appearance
   */
  @Column(name = "RESOURCE_APPEARANCE_ORDER", nullable = false)
  private int appearanceOrder;

  /**
   * Resource authorized groups
   */
  @ManyToMany
  @JoinTable(name = "TA_RESOURCES_GROUPS", joinColumns = @JoinColumn(name = "TA_RESOURCES_ID_RESOURCE", referencedColumnName = "ID_RESOURCE"), inverseJoinColumns = @JoinColumn(name = "TA_GROUPS_ID_GROUP", referencedColumnName = "ID_GROUP"))
  private List<Group> groups = new ArrayList<Group>();

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
   * @return the uri
   */
  public String getUri() {
    return uri;
  }

  /**
   * @param uri the uri to set
   */
  public void setUri(String uri) {
    this.uri = uri;
  }

  /**
   * @return the appearanceOrder
   */
  public int getAppearanceOrder() {
    return appearanceOrder;
  }

  /**
   * @param appearanceOrder the appearanceOrder to set
   */
  public void setAppearanceOrder(int appearanceOrder) {
    this.appearanceOrder = appearanceOrder;
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

}
