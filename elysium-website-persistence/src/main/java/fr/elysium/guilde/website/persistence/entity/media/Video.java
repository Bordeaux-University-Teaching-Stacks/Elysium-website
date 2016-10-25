package fr.elysium.guilde.website.persistence.entity.media;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * <b>Video</b> stands for the video's informations
 * 
 * @author Meidi
 * 
 */
@Entity
@Table(name = "TA_VIDEOS")
public class Video {

  /**
   * Video unique ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_VIDEO", unique = true, nullable = false)
  private long id;

  /**
   * Video title
   */
  @Column(name = "VIDEO_TITLE", nullable = false, length = 255)
  private String title;

  /**
   * Video description
   */
  @Column(name = "VIDEO_DESCRIPTION", nullable = false, length = 255)
  private String description;

  /**
   * Video integration code
   */
  @Column(name = "VIDEO_INTEGRATION_CODE", nullable = false)
  @Lob
  private String integrationCode;

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
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * @return the integrationCode
   */
  public String getIntegrationCode() {
    return integrationCode;
  }

  /**
   * @param integrationCode the integrationCode to set
   */
  public void setIntegrationCode(String integrationCode) {
    this.integrationCode = integrationCode;
  }

}
