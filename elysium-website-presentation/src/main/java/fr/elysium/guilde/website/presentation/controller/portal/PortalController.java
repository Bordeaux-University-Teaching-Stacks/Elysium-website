package fr.elysium.guilde.website.presentation.controller.portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import fr.elysium.guilde.website.business.service.ui.ResourceBusinessService;
import fr.elysium.guilde.website.persistence.entity.acl.User;
import fr.elysium.guilde.website.presentation.controller.commons.AbstractElysiumController;
import fr.elysium.guilde.website.presentation.controller.portal.enums.PortalSceneEnum;

/**
 * <b>PortalController</b> routes actions from the Portal
 * 
 * @author Meidi
 *
 */
@Controller
@RequestMapping("/")
@SessionAttributes(value = {"currentUser", "menus"})
public class PortalController extends AbstractElysiumController {

  @Autowired
  private ResourceBusinessService resourceBusinessService;

  /**
   * Home page : render the portal
   * 
   * @return
   */
  @RequestMapping(method = RequestMethod.GET)
  public ModelAndView renderHome(@ModelAttribute User currentUser) {
    ModelAndView page = new ModelAndView(PortalSceneEnum.HOME_SCENE.getValue());
    page.addObject("menus", resourceBusinessService.listMainMenu(currentUser.getGroup()));
    return page;
  }
}
