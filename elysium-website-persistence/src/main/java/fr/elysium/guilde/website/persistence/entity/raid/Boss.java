package fr.elysium.guilde.website.persistence.entity.raid;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * <b>Boss</b> stands for the ennemies that the guild have to defeat
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_BOSSES")
public class Boss {

  /**
   * Boss unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_BOSS", unique = true, nullable = false)
  private long id;

  /**
   * Boss name
   */
  @Column(name = "BOSS_NAME", nullable = false, length = 50)
  private String name;

  /**
   * Boss illustration
   */
  @Column(name = "BOSS_ILLUSTRATION", nullable = false, length = 255)
  private String illustration;

  /**
   * Boss achievement
   */
  @OneToMany(mappedBy = "boss")
  private List<Achievement> achievements = new ArrayList<Achievement>();

  /**
   * Boss order
   */
  @Column(name = "BOSS_ORDER", nullable = false)
  private int order;

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
   * @return the achievements
   */
  public List<Achievement> getAchievements() {
    return achievements;
  }

  /**
   * @param achievements the achievements to set
   */
  public void setAchievements(List<Achievement> achievements) {
    this.achievements = achievements;
  }

  /**
   * @return the order
   */
  public int getOrder() {
    return order;
  }

  /**
   * @param order the order to set
   */
  public void setOrder(int order) {
    this.order = order;
  }

}
