package fr.elysium.guilde.website.presentation.portal.vo;

import java.io.Serializable;
import java.util.Date;

import fr.elysium.guilde.website.persistence.entity.acl.User;

/**
 * <b>NewsVO</b> News value object
 * 
 * @author Meidi
 *
 */
public class NewsVO implements Serializable {

  /**
   * Serial ID
   */
  private static final long serialVersionUID = 2299386735250095176L;

  /**
   * Article title
   */
  private String title;

  /**
   * Article preview
   */
  private String preview;

  /**
   * Article content
   */
  private String content;

  /**
   * Article illustration
   */
  private String illustration;

  /**
   * Article header image
   */
  private String headerImage;

  /**
   * Article author
   */
  private User author;

  /**
   * Article creation date
   */
  private Date dateCreate;

  /**
   * Article update date
   */
  private Date dateUpdate;

  /**
   * Article coverage image
   */
  private String coverageImage;

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
   * @return the coverageImage
   */
  public String getCoverageImage() {
    return coverageImage;
  }

  /**
   * @param coverageImage the coverageImage to set
   */
  public void setCoverageImage(String coverageImage) {
    this.coverageImage = coverageImage;
  }

}
