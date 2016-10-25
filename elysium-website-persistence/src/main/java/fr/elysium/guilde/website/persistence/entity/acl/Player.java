package fr.elysium.guilde.website.persistence.entity.acl;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import fr.elysium.guilde.website.persistence.entity.avatar.Character;

/**
 * <b>Player</b> specialize a User in a Player
 * 
 * @author Meidi
 * 
 */
@Entity
@DiscriminatorValue("PLAYER")
public class Player extends User {

  /**
   * In-game player nickname
   */
  @Column(name = "PLAYER_NICKNAME", nullable = false, length = 50)
  private String nickname;

  /**
   * In-game player characters
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_USER")
  private List<Character> characters;

  /**
   * @return the nickname
   */
  public String getNickname() {
    return nickname;
  }

  /**
   * @param nickname the nickname to set
   */
  public void setNickname(String nickname) {
    this.nickname = nickname;
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

}
