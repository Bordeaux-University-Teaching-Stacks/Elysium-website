package fr.elysium.guilde.website.presentation.portal.vo;

import java.io.Serializable;

/**
 * <b>ResourceVO</b> Resource value object
 * 
 * @author Meidi
 *
 */
public class ResourceVO implements Serializable {

  /**
   * Serial ID
   */
  private static final long serialVersionUID = 4148066868056605256L;

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
