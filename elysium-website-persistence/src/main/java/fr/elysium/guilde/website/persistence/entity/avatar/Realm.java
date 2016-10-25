package fr.elysium.guilde.website.persistence.entity.avatar;

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
 * <b>Realm</b> stands for the Blizzard Realms
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_REALMS")
public class Realm {

  /**
   * Realm unique identifier
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_REALM", unique = true, nullable = false)
  private int id;

  /**
   * Realm name
   */
  @Column(name = "REALM_NAME", nullable = false, length = 50)
  private String name;

  /**
   * Realm characters
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_REALM")
  private List<Character> characters;

  /**
   * Realm region
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_REGION")
  private Region region;

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
   * @return the characters
   */
  public List<Character> getCharacters() {
    return characters;
  }

  /**
   * @param characters the characters to set
   */
  public void setCharacters(List<Character> characters) {
    this.characters = characters;
  }

  /**
   * @return the region
   */
  public Region getRegion() {
    return region;
  }

  /**
   * @param region the region to set
   */
  public void setRegion(Region region) {
    this.region = region;
  }

}
