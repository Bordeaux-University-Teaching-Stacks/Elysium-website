package fr.elysium.guilde.website.presentation.portal;

import org.junit.Test;

import fr.elysium.guilde.website.presentation.portal.enums.PortalSceneEnum;
import fr.elysium.guilde.website.presentation.util.AbstractControllerTest;

public class PortalControllerTest extends AbstractControllerTest {

	@Test
	public void testRenderHome() throws Exception {
		testRoute("/", PortalSceneEnum.HOME_SCENE.getValue(), this.GET);
	}

}
