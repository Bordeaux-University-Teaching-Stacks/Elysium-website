package fr.elysium.guilde.website.business.service.ui;

import static org.junit.Assert.*;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.elysium.guilde.website.business.service.util.AbstractBusinessServiceTest;
import fr.elysium.guilde.website.service.ui.ResourceService;

public class ResourceBusinessServiceTest extends AbstractBusinessServiceTest {

	private static final int GUEST_GROUP_ID = 1;
	
	@Autowired
	private ResourceService resourceService;
	
	@Test
	public void testListMainMenu() {
		assertTrue(CollectionUtils.isNotEmpty(resourceService.listMainResources(GUEST_GROUP_ID)));
	}

}
