package fr.elysium.guilde.website.presentation.controller.portal.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <b>PortalEnvironmentVariableUtil</b>
 * 
 * @author Meidi
 *
 */
@Component
public class PortalEnvironmentVariableUtil {
  
  @Value("#{nbNewsSlider}")
  private int nbNewsSlider;

  /**
   * @return the nbNewsSlider
   */
  public int getNbNewsSlider() {
    return nbNewsSlider;
  }

}
