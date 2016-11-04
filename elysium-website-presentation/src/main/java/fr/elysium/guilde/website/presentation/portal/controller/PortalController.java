package fr.elysium.guilde.website.presentation.portal.controller;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import fr.elysium.guilde.website.business.service.media.ArticleBusinessService;
import fr.elysium.guilde.website.business.service.ui.ResourceBusinessService;
import fr.elysium.guilde.website.commons.utils.DozerUtils;
import fr.elysium.guilde.website.presentation.commons.AbstractElysiumController;
import fr.elysium.guilde.website.presentation.portal.enums.PortalSceneEnum;
import fr.elysium.guilde.website.presentation.portal.util.PortalEnvironmentVariableUtil;
import fr.elysium.guilde.website.presentation.portal.vo.ResourceVO;

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
  private Mapper mapper;

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
    this.page.addObject("resources", DozerUtils.map(mapper,
        resourceBusinessService.listMainMenu(this.currentUser.getGroup()), ResourceVO.class));
    this.page.addObject("news",
        articleBusinessService.listLastNews(portalEnvironmentVariableUtil.getNbNewsSlider()));
    return this.page;
  }
}
