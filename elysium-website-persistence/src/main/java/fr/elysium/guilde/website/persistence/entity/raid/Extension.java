package fr.elysium.guilde.website.persistence.entity.raid;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * <b>Extension</b> stands for Blizzard version extensions
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_EXTENSIONS")
public class Extension {

  /**
   * Extension unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_EXTENSION", unique = true, nullable = false)
  private long id;

  /**
   * Extension name
   */
  @Column(name = "EXTENSION_NAME", nullable = false, length = 50)
  private String name;

  /**
   * Extension logo
   */
  @Column(name = "EXTENSION_LOGO", nullable = false, length = 255)
  private String logo;

  /**
   * Extension patches
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_PATCH")
  private List<Patch> patches;

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
   * @return the logo
   */
  public String getLogo() {
    return logo;
  }

  /**
   * @param logo the logo to set
   */
  public void setLogo(String logo) {
    this.logo = logo;
  }

  /**
   * @return the patches
   */
  public List<Patch> getPatches() {
    return patches;
  }

  /**
   * @param patches the patches to set
   */
  public void setPatches(List<Patch> patches) {
    this.patches = patches;
  }

}
