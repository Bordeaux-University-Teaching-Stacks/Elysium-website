package fr.elysium.guilde.website.persistence.entity.raid;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * <b>Achievement</b> stands for the association between <b>Boss</b> and <b>Difficulty</b>
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_ACHIEVEMENTS")
public class Achievement {

  /**
   * Achievement unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_ACHIEVEMENT", unique = true, nullable = false)
  private long id;

  /**
   * Achievement boss
   */
  @ManyToOne
  @JoinColumn(name = "ID_BOSS")
  private Boss boss;

  /**
   * Achievement difficulty
   */
  @ManyToOne
  @JoinColumn(name = "ID_DIFFICULTY")
  private Difficulty difficulty;

  /**
   * Achievement down or not
   */
  @Column(name = "ACHIEVEMENT_DOWN", nullable = false)
  private boolean down;

  /**
   * Achievement date
   */
  @Column(name = "ACHIEVEMENT_DOWN_DATE", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
  private Date downDate;

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
   * @return the boss
   */
  public Boss getBoss() {
    return boss;
  }

  /**
   * @param boss the boss to set
   */
  public void setBoss(Boss boss) {
    this.boss = boss;
  }

  /**
   * @return the difficulty
   */
  public Difficulty getDifficulty() {
    return difficulty;
  }

  /**
   * @param difficulty the difficulty to set
   */
  public void setDifficulty(Difficulty difficulty) {
    this.difficulty = difficulty;
  }

  /**
   * @return the down
   */
  public boolean isDown() {
    return down;
  }

  /**
   * @param down the down to set
   */
  public void setDown(boolean down) {
    this.down = down;
  }

  /**
   * @return the downDate
   */
  public Date getDownDate() {
    return downDate;
  }

  /**
   * @param downDate the downDate to set
   */
  public void setDownDate(Date downDate) {
    this.downDate = downDate;
  }

}
