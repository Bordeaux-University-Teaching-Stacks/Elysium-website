package fr.elysium.guilde.website.persistence.entity.social;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import fr.elysium.guilde.website.persistence.entity.acl.User;

/**
 * <b>ForumPost</b> stands for the different posts of a forum's category
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_FORUMS_POSTS")
public class ForumPost {

  /**
   * Post unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_FORUM_POST")
  private long id;

  /**
   * Post title
   */
  @Column(name = "FORUM_POST_TITLE", nullable = false, length = 150)
  private String title;

  /**
   * Post content
   */
  @Column(name = "FORUM_POST_CONTENT", nullable = false)
  @Lob
  private String content;

  /**
   * Post creation date
   */
  @Column(name = "FORUM_POST_CREATION_DATE", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
  private Date dateCreate;

  /**
   * Post update date
   */
  @Column(name = "FORUM_POST_UPDATE_DATE", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
  private Date dateUpdate;

  /**
   * Able / Unable replies on the post
   */
  @Column(name = "FORUM_POST_LOCKED", nullable = false)
  private boolean locked = false;

  /**
   * Post author
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_USER")
  private User author;

  /**
   * Post replies
   */
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FORUM_POST")
  @OrderBy("FORUM_REPLY_DATE_CREATION ASC, FORUM_REPLY_DATE_UPDATE ASC")
  private List<ForumReply> replies;

  /**
   * Post categories
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FORUM_CATEGORY")
  private ForumCategory category;

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
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * @return the content
   */
  public String getContent() {
    return content;
  }

  /**
   * @param content the content to set
   */
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * @return the dateCreate
   */
  public Date getDateCreate() {
    return dateCreate;
  }

  /**
   * @param dateCreate the dateCreate to set
   */
  public void setDateCreate(Date dateCreate) {
    this.dateCreate = dateCreate;
  }

  /**
   * @return the dateUpdate
   */
  public Date getDateUpdate() {
    return dateUpdate;
  }

  /**
   * @param dateUpdate the dateUpdate to set
   */
  public void setDateUpdate(Date dateUpdate) {
    this.dateUpdate = dateUpdate;
  }

  /**
   * @return the locked
   */
  public boolean isLocked() {
    return locked;
  }

  /**
   * @param locked the locked to set
   */
  public void setLocked(boolean locked) {
    this.locked = locked;
  }

  /**
   * @return the author
   */
  public User getAuthor() {
    return author;
  }

  /**
   * @param author the author to set
   */
  public void setAuthor(User author) {
    this.author = author;
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
   * @return the category
   */
  public ForumCategory getCategory() {
    return category;
  }

  /**
   * @param category the category to set
   */
  public void setCategory(ForumCategory category) {
    this.category = category;
  }

}
