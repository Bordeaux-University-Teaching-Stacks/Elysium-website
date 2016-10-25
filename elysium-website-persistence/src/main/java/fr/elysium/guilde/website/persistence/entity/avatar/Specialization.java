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
 * <b>Specialization</b> stands for the different specializations that can be played for a race
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_SPECIALIZATIONS")
public class Specialization {

  /**
   * Specialization unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_SPECIALIZATION")
  private long id;

  /**
   * Specialization name
   */
  @Column(name = "SPECIALIZATION_NAME", nullable = false, length = 50)
  private String name;

  /**
   * The path to the spec image
   */
  @Column(name = "SPECIALIZATION_IMAGE", nullable = false, length = 255)
  private String image;

  /**
   * Recruiting the specialization or not
   */
  @Column(name = "SPECIALIZATION_RECRUITING")
  private boolean recruiting = false;

  /**
   * The class where the specialization is from
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_CLASS")
  private Clazz clazz;

  /**
   * Characters playing this specialization
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_SPECIALIZATION")
  private List<Character> characters;

  /**
   * Role of this specialization
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_ROLE")
  private Role role;

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
   * @return the recruiting
   */
  public boolean isRecruiting() {
    return recruiting;
  }

  /**
   * @param recruiting the recruiting to set
   */
  public void setRecruiting(boolean recruiting) {
    this.recruiting = recruiting;
  }

  /**
   * @return the clazz
   */
  public Clazz getClazz() {
    return clazz;
  }

  /**
   * @param clazz the clazz to set
   */
  public void setClazz(Clazz clazz) {
    this.clazz = clazz;
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
   * @return the role
   */
  public Role getRole() {
    return role;
  }

  /**
   * @param role the role to set
   */
  public void setRole(Role role) {
    this.role = role;
  }

}
