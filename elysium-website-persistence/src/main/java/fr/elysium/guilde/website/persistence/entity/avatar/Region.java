package fr.elysium.guilde.website.persistence.entity.avatar;

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
 * <b>Region</b> stands for the Blizzard Regions
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_REGIONS")
public class Region {

  /**
   * Region unique identifier
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_REGION", unique = true, nullable = false)
  private int id;

  /**
   * Region name
   */
  @Column(name = "REGION_NAME", nullable = false, length = 50)
  private String name;

  /**
   * Region realms
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_REGION")
  private List<Realm> realms;

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
   * @return the realms
   */
  public List<Realm> getRealms() {
    return realms;
  }

  /**
   * @param realms the realms to set
   */
  public void setRealms(List<Realm> realms) {
    this.realms = realms;
  }

}
