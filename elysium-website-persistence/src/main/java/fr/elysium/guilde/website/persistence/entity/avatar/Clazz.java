package fr.elysium.guilde.website.persistence.entity.avatar;

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

/**
 * <b>Clazz</b> stands for the different classes that can be played for a race
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_CLASSES")
public class Clazz {

  /**
   * Technical unique identifier for a Class
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_CLASS")
  private int id;

  /**
   * Stands for the name of the Class
   */
  @Column(name = "CLASS_NAME", nullable = false, unique = true, length = 50)
  private String name;

  /**
   * Path to the class image
   */
  @Column(name = "CLASS_IMAGE", nullable = false, unique = false, length = 255)
  private String image;

  /**
   * Class specializations
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_CLASS")
  private List<Specialization> specializations;

  /**
   * In-game class characters
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_CLASS")
  private List<Character> characters;

  /**
   * Races available for class
   */
  @ManyToMany(mappedBy = "classes")
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
   * @return the image
   */
  public String getImage() {
    return image;
  }

  /**
   * @param image the image to set
   */
  public void setImage(String image) {
    this.image = image;
  }

  /**
   * @return the specializations
   */
  public List<Specialization> getSpecializations() {
    return specializations;
  }

  /**
   * @param specializations the specializations to set
   */
  public void setSpecializations(List<Specialization> specializations) {
    this.specializations = specializations;
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
