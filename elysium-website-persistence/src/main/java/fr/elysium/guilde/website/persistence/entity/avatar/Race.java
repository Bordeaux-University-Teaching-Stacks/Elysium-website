package fr.elysium.guilde.website.persistence.entity.avatar;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * <b>Race</b> stands for the different races that can be played or available for a faction
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_RACES")
public class Race {

  /**
   * Faction unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_RACE", nullable = false, unique = true)
  private int id;

  /**
   * Race name
   */
  @Column(name = "RACE_NAME", nullable = false, unique = true, length = 50)
  private String name;

  /**
   * Character race
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FACTION")
  private Faction faction;

  /**
   * In-game race characters
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_RACE")
  private List<Character> characters;

  /**
   * Race playable classes
   */
  @ManyToMany
  @JoinTable(name = "TA_RACES_CLASSES", joinColumns = @JoinColumn(name = "TA_RACES_ID_RACE", referencedColumnName = "ID_RACE"), inverseJoinColumns = @JoinColumn(name = "TA_CLASSES_ID_CLASS", referencedColumnName = "ID_CLASS"))
  private List<Clazz> classes;

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
   * @return the faction
   */
  public Faction getFaction() {
    return faction;
  }

  /**
   * @param faction the faction to set
   */
  public void setFaction(Faction faction) {
    this.faction = faction;
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
   * @return the classes
   */
  public List<Clazz> getClasses() {
    return classes;
  }

  /**
   * @param classes the classes to set
   */
  public void setClasses(List<Clazz> classes) {
    this.classes = classes;
  }

}
