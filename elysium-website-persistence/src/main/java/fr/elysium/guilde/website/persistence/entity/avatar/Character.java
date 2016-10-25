package fr.elysium.guilde.website.persistence.entity.avatar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.elysium.guilde.website.persistence.entity.acl.Player;

/**
 * <b>Character</b> describe an in-game character played by a User
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_CHARACTERS")
public class Character {

  /**
   * Character unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_CHARACTER")
  private long id;

  /**
   * Player owning the Character
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_USER")
  private Player player;

  /**
   * Character race
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FACTION")
  private Faction faction;

  /**
   * Character race
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_RACE")
  private Race race;

  /**
   * Character class
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_CLASS")
  private Clazz clazz;

  /**
   * Character main specialization
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_SPECIALISATION")
  private Specialization mainSpecialisation;

  /**
   * Character realm
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_REALM")
  private Realm realm;

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
   * @return the player
   */
  public Player getPlayer() {
    return player;
  }

  /**
   * @param player the player to set
   */
  public void setPlayer(Player player) {
    this.player = player;
  }

  /**
   * @return the race
   */
  public Race getRace() {
    return race;
  }

  /**
   * @param race the race to set
   */
  public void setRace(Race race) {
    this.race = race;
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
   * @return the mainSpecialisation
   */
  public Specialization getMainSpecialisation() {
    return mainSpecialisation;
  }

  /**
   * @param mainSpecialisation the mainSpecialisation to set
   */
  public void setMainSpecialisation(Specialization mainSpecialisation) {
    this.mainSpecialisation = mainSpecialisation;
  }

  /**
   * @return the realm
   */
  public Realm getRealm() {
    return realm;
  }

  /**
   * @param realm the realm to set
   */
  public void setRealm(Realm realm) {
    this.realm = realm;
  }

}
