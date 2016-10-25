package fr.elysium.guilde.website.presentation.controller.portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import fr.elysium.guilde.website.business.service.ui.ArticleBusinessService;
import fr.elysium.guilde.website.business.service.ui.ResourceBusinessService;
import fr.elysium.guilde.website.presentation.controller.commons.AbstractElysiumController;
import fr.elysium.guilde.website.presentation.controller.portal.enums.PortalSceneEnum;
import fr.elysium.guilde.website.presentation.controller.portal.util.PortalEnvironmentVariableUtil;

/**
 * <b>PortalController</b> routes actions from the Portal
 * 
 * @author Meidi
 *
 */
@Controller
@RequestMapping("/")
@SessionAttributes(value = {"currentUser", "resources"})
public class PortalController extends AbstractElysiumController {

  @Autowired
  private ResourceBusinessService resourceBusinessService;

  @Autowired
  private ArticleBusinessService articleBusinessService;
  
  @Autowired
  private PortalEnvironmentVariableUtil portalEnvironmentVariableUtil;

  /**
   * Home page : render the portal
   * 
   * @return
   */
  @RequestMapping(method = RequestMethod.GET)
  public ModelAndView renderHome() {
    this.page = new ModelAndView(PortalSceneEnum.HOME_SCENE.getValue());
    this.page.addObject("resources", resourceBusinessService.listMainMenu(this.currentUser.getGroup()));
    this.page.addObject("news", articleBusinessService.listLastNews(portalEnvironmentVariableUtil.getNbNewsSlider()));
    return this.page;
  }
}
