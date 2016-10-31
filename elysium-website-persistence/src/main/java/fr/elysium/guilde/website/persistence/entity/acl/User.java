package fr.elysium.guilde.website.persistence.entity.acl;

import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import fr.elysium.guilde.website.persistence.entity.media.Article;
import fr.elysium.guilde.website.persistence.entity.social.ForumPost;
import fr.elysium.guilde.website.persistence.entity.social.ForumReply;

/**
 * <b>User</b> stands for the common users information
 * 
 * @author Meidi
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "USER_TYPE")
@Table(name="TA_USERS")
public abstract class User {
  
  /**
   * User unique identifier
   */
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "ID_USER", nullable = false, unique = true)
  protected long id;
  
  /**
   * User name
   */
  @Column(name = "USER_NAME", nullable = true, length = 50)
  protected String name;
  
  /**
   * User surname
   */
  @Column(name = "USER_SURNAME", nullable = true, length = 50)
  protected String surname;
  
  /**
   * User email
   */
  @Column(name = "USER_EMAIL", nullable = false, unique = true, length = 100)
  protected String email;
  
  /**
   * User encrypted password
   */
  @Column(name = "USER_PASSWORD", nullable = false, length = 255)
  protected String password;
  
  /**
   * User birth date
   */
  @Column(name = "USER_BIRTH", nullable = true)
  @Temporal(TemporalType.DATE)
  @DateTimeFormat(pattern = "dd/MM/yyyy")
  protected Date birth;

  /**
   * User phone number
   */
  @Column(name = "USER_PHONE_NUMBER", nullable = true, length = 10)
  protected int phoneNumber;
  
  /**
   * User is enabled / disabled
   */
  @Column(name = "USER_ACTIVE", nullable = false)
  protected boolean active = false;
  
  /**
   * User agreed with legals or not
   */
  @Column(name = "USER_AGREE_LEGALS", nullable = false)
  protected boolean agreeWithLegals = false;
  
  /**
   * User avatar
   */
  @Column(name = "USER_AVATAR", nullable = true, length = 255)
  protected String avatar;

  /**
   * User forum posts
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_USER")
  protected List<ForumPost> posts;

  /**
   * User replies
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_USER")
  protected List<ForumReply> replies;

  /**
   * User articles
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_USER")
  protected List<Article> articles;

  /**
   * User group
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_GROUP")
  protected Group group;

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
   * @return the surname
   */
  public String getSurname() {
    return surname;
  }

  /**
   * @param surname the surname to set
   */
  public void setSurname(String surname) {
    this.surname = surname;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return the birth
   */
  public Date getBirth() {
    return birth;
  }

  /**
   * @param birth the birth to set
   */
  public void setBirth(Date birth) {
    this.birth = birth;
  }

  /**
   * @return the phoneNumber
   */
  public int getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * @param phoneNumber the phoneNumber to set
   */
  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * @return the active
   */
  public boolean isActive() {
    return active;
  }

  /**
   * @param active the active to set
   */
  public void setActive(boolean active) {
    this.active = active;
  }

  /**
   * @return the agreeWithLegals
   */
  public boolean isAgreeWithLegals() {
    return agreeWithLegals;
  }

  /**
   * @param agreeWithLegals the agreeWithLegals to set
   */
  public void setAgreeWithLegals(boolean agreeWithLegals) {
    this.agreeWithLegals = agreeWithLegals;
  }

  /**
   * @return the avatar
   */
  public String getAvatar() {
    return avatar;
  }

  /**
   * @param avatar the avatar to set
   */
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  /**
   * @return the posts
   */
  public List<ForumPost> getPosts() {
    return posts;
  }

  /**
   * @param posts the posts to set
   */
  public void setPosts(List<ForumPost> posts) {
    this.posts = posts;
  }

  /**
   * @return the replies
   */
  public List<ForumReply> getReplies() {
    return replies;
  }

  /**
   * @param replies the replies to set
   */
  public void setReplies(List<ForumReply> replies) {
    this.replies = replies;
  }

  /**
   * @return the articles
   */
  public List<Article> getArticles() {
    return articles;
  }

  /**
   * @param articles the articles to set
   */
  public void setArticles(List<Article> articles) {
    this.articles = articles;
  }

  /**
   * @return the group
   */
  public Group getGroup() {
    return group;
  }

  /**
   * @param group the group to set
   */
  public void setGroup(Group group) {
    this.group = group;
  }

}
