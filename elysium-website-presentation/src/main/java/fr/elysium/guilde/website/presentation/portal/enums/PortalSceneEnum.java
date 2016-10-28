package fr.elysium.guilde.website.presentation.portal.enums;

/**
 * <b>PortalSceneEnum</b> list the portal scenes
 * 
 * @author Meidi
 *
 */
public enum PortalSceneEnum {

  HOME_SCENE("portal");

  private String value;

  private PortalSceneEnum(String value) {
    this.value = value;
  }

  /**
   * @return the value
   */
  public String getValue() {
    return value;
  }

}
