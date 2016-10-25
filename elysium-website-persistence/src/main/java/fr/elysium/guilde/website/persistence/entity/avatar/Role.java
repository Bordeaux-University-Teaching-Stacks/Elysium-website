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

@Entity
@Table(name = "TA_ROLES")
public class Role {

  /**
   * Role unique identifier
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_ROLE", unique = true, nullable = false)
  private long id;

  /**
   * Role name
   */
  @Column(name = "ROLE_NAME", nullable = false, length = 50)
  private String name;

  /**
   * Role specializations
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_ROLE")
  private List<Specialization> specializations;

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

}
