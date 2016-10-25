package fr.elysium.guilde.website.persistence.entity.media;

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
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import fr.elysium.guilde.website.persistence.entity.acl.Group;
import fr.elysium.guilde.website.persistence.entity.acl.User;

/**
 * <b>Article</b> is the base class for articles
 * 
 * @author Meidi
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ARTICLE_TYPE")
@Table(name = "TA_ARTICLES")
public abstract class Article {

  /**
   * Article unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_ARTICLE", unique = true, nullable = false)
  private long id;

  /**
   * Article title
   */
  @Column(name = "ARTICLE_TITLE", nullable = false, length = 150)
  private String title;

  /**
   * Article preview
   */
  @Column(name = "ARTICLE_PREVIEW", nullable = false, length = 255)
  private String preview;

  /**
   * Article content
   */
  @Column(name = "ARTICLE_CONTENT", nullable = false)
  @Lob
  private String content;

  /**
   * Article illustration
   */
  @Column(name = "ARTICLE_ILLUSTRATION", nullable = false, length = 255)
  private String illustration;

  /**
   * Article header image
   */
  @Column(name = "ARTICLE_HEADER_IMAGE", nullable = false, length = 255)
  private String headerImage;

  /**
   * Article author
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_USER")
  private User author;

  /**
   * Article creation date
   */
  @Column(name = "ARTICLE_CREATION_DATE", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
  private Date dateCreate;

  /**
   * Article update date
   */
  @Column(name = "ARTICLE_UPDATE_DATE", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
  private Date dateUpdate;

  /**
   * Article authorized groups
   */
  @ManyToMany
  @JoinTable(name = "TA_ARTICLES_GROUPS", joinColumns = @JoinColumn(name = "TA_ARTICLES_ID_ARTICLE", referencedColumnName = "ID_ARTICLE"), inverseJoinColumns = @JoinColumn(name = "TA_GROUPS_ID_GROUP", referencedColumnName = "ID_GROUP"))
  private List<Group> groups;

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
   * @return the preview
   */
  public String getPreview() {
    return preview;
  }

  /**
   * @param preview the preview to set
   */
  public void setPreview(String preview) {
    this.preview = preview;
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
   * @return the headerImage
   */
  public String getHeaderImage() {
    return headerImage;
  }

  /**
   * @param headerImage the headerImage to set
   */
  public void setHeaderImage(String headerImage) {
    this.headerImage = headerImage;
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
   * @return the groups
   */
  public List<Group> getGroups() {
    return groups;
  }

  /**
   * @param groups the groups to set
   */
  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

}
