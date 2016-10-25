package fr.elysium.guilde.website.persistence.entity.raid;

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
import javax.persistence.Table;

/**
 * <b>Patch</b> stands for Blizzard version patches
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_PATCHES")
public class Patch {

  /**
   * Patch unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PATCH", unique = true, nullable = false)
  private long id;

  /**
   * Patch name
   */
  @Column(name = "PATCH_NAME", nullable = false, length = 100)
  private String name;

  /**
   * The X of the version of the Patch provided by Blizzard
   */
  @Column(name = "PATCH_VERSION_X", nullable = false, length = 2)
  private String versionX;

  /**
   * The Y of the version of the Patch provided by Blizzard
   */
  @Column(name = "PATCH_VERSION_Y", nullable = false, length = 2)
  private String versionY;

  /**
   * The 2 of the version of the Patch provided by Blizzard
   */
  @Column(name = "PATCH_VERSION_Z", nullable = false, length = 2)
  private String versionZ;

  /**
   * The list of raids from the patch
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_RAID")
  private List<Raid> raids;

  /**
   * The Extension where the patch is from
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_EXTENSION")
  private Extension extension;

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
   * @return the versionX
   */
  public String getVersionX() {
    return versionX;
  }

  /**
   * @param versionX the versionX to set
   */
  public void setVersionX(String versionX) {
    this.versionX = versionX;
  }

  /**
   * @return the versionY
   */
  public String getVersionY() {
    return versionY;
  }

  /**
   * @param versionY the versionY to set
   */
  public void setVersionY(String versionY) {
    this.versionY = versionY;
  }

  /**
   * @return the versionZ
   */
  public String getVersionZ() {
    return versionZ;
  }

  /**
   * @param versionZ the versionZ to set
   */
  public void setVersionZ(String versionZ) {
    this.versionZ = versionZ;
  }

  /**
   * @return the raids
   */
  public List<Raid> getRaids() {
    return raids;
  }

  /**
   * @param raids the raids to set
   */
  public void setRaids(List<Raid> raids) {
    this.raids = raids;
  }

  /**
   * @return the extension
   */
  public Extension getExtension() {
    return extension;
  }

  /**
   * @param extension the extension to set
   */
  public void setExtension(Extension extension) {
    this.extension = extension;
  }

}
