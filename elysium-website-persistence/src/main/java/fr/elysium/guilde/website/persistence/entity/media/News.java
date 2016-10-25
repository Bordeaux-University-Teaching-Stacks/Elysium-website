package fr.elysium.guilde.website.persistence.entity.media;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * <b>News</b> is the news specialization of Article
 * 
 * @author Meidi
 * 
 */
@Entity
@DiscriminatorValue("NEWS")
public class News extends Article {

  /**
   * Article coverage image
   */
  @Column(name = "NEWS_COVERAGE_IMAGE", nullable = true, length = 255)
  private String coverageImage;

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
