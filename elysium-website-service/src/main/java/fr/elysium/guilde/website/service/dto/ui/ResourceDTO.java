package fr.elysium.guilde.website.service.dto.ui;

/**
 * <b>ResourceDTO</b> Resource Data Transfer Object
 * 
 * @author Meidi
 *
 */
public class ResourceDTO {

  /**
   * Resource name
   */
  private String name;

  /**
   * Resource uri
   */
  private String uri;

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
   * @return the uri
   */
  public String getUri() {
    return uri;
  }

  /**
   * @param uri the uri to set
   */
  public void setUri(String uri) {
    this.uri = uri;
  }

}
