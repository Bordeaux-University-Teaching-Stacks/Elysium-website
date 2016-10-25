package fr.elysium.guilde.website.persistence.entity.raid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * <b>Raid</b> stands for Blizzard version raids
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_RAIDS")
public class Raid {

  /**
   * Raid unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_RAID", unique = true, nullable = false)
  private long id;

  /**
   * Raid name
   */
  @Column(name = "RAID_NAME", nullable = false, length = 100)
  private String name;

  /**
   * Raid illustration
   */
  @Column(name = "RAID_ILLUSTRATION", nullable = false, length = 255)
  private String illustration;

  /**
   * Raid acronym
   */
  @Column(name = "RAID_ACRONYM", length = 6)
  private String acronym;

  /**
   * Raid patch
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_PATCH")
  private Patch patch;

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
   * @return the illustration
   */
  public String getIllustration() {
    return illustration;
  }

  /**
   * @param illustration the illustration to set
   */
  public void setIllustration(String illustration) {
    this.illustration = illustration;
  }

  /**
   * @return the acronym
   */
  public String getAcronym() {
    return acronym;
  }

  /**
   * @param acronym the acronym to set
   */
  public void setAcronym(String acronym) {
    this.acronym = acronym;
  }

  /**
   * @return the patch
   */
  public Patch getPatch() {
    return patch;
  }

  /**
   * @param patch the patch to set
   */
  public void setPatch(Patch patch) {
    this.patch = patch;
  }

}
