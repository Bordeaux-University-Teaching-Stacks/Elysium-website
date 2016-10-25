package fr.elysium.guilde.website.persistence.entity.avatar;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * <b>Faction</b> describe an in-game group of races playing together
 * 
 * @author Meidi
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "FACTION_TYPE")
@Table(name = "TA_FACTIONS")
public abstract class Faction {

  /**
   * Faction unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_FACTION", nullable = false, unique = true)
  private int id;

  /**
   * Faction name
   */
  @Column(name = "FACTION_NAME", nullable = false, unique = true, length = 50)
  private String name;

  /**
   * In-game faction characters
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FACTION")
  private List<Character> characters;

  /**
   * In-game faction characters
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FACTION")
  private List<Race> races;

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
   * @return the races
   */
  public List<Race> getRaces() {
    return races;
  }

  /**
   * @param races the races to set
   */
  public void setRaces(List<Race> races) {
    this.races = races;
  }

}
