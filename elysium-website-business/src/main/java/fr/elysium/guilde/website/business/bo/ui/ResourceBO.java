package fr.elysium.guilde.website.business.bo.ui;

import java.io.Serializable;

/**
 * <b>ResourceBO</b> is the serialization of Resource
 * 
 * @author Meidi
 *
 */
public class ResourceBO implements Serializable {

  /**
   * Serial ID
   */
  private static final long serialVersionUID = -8725819745007777371L;

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
