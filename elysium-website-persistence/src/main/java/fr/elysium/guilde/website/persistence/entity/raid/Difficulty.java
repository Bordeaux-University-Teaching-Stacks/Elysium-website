package fr.elysium.guilde.website.persistence.entity.raid;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * <b>Difficulty</b> stands for the different mods to play on a Boss
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_DIFFICULTIES")
public class Difficulty {

  /**
   * Difficulty unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_DIFFICULTY", unique = true, nullable = false)
  private int id;

  /**
   * Difficulty name
   */
  @Column(name = "DIFFICULTY_NAME", nullable = false, length = 50)
  private String name;

  /**
   * Difficulty achievements
   */
  @OneToMany(mappedBy = "difficulty")
  private List<Achievement> achievement;

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
   * @return the achievement
   */
  public List<Achievement> getAchievement() {
    return achievement;
  }

  /**
   * @param achievement the achievement to set
   */
  public void setAchievement(List<Achievement> achievement) {
    this.achievement = achievement;
  }

}
