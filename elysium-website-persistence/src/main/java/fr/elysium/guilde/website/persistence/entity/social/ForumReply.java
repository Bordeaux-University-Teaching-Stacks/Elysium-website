package fr.elysium.guilde.website.persistence.entity.social;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import fr.elysium.guilde.website.persistence.entity.acl.User;

/**
 * <b>ForumReply</b> stands for the different reply of a forum's post
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_FORUM_REPLY")
public class ForumReply {

  /**
   * Reply unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_FORUM_REPLY")
  private long id;

  /**
   * Reply content
   */
  @Column(name = "FORUM_REPLY_CONTENT", nullable = false)
  @Lob
  private String content;

  /**
   * Reply creation date
   */
  @Column(name = "FORUM_REPLY_CREATION_DATE", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
  private Date dateCreate;

  /**
   * Reply update date
   */
  @Column(name = "FORUM_REPLY_UPDATE_DATE", nullable = true)
  @Temporal(TemporalType.TIMESTAMP)
  @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
  private Date dateUpdate;

  /**
   * Reply author
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_USER")
  private User author;

  /**
   * Reply post
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FORUM_POST")
  private ForumPost post;

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
   * @return the post
   */
  public ForumPost getPost() {
    return post;
  }

  /**
   * @param post the post to set
   */
  public void setPost(ForumPost post) {
    this.post = post;
  }

}
