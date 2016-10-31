package fr.elysium.guilde.website.persistence.repository.ui;

import static org.junit.Assert.assertTrue;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.elysium.guilde.website.persistence.entity.ui.Resource;
import fr.elysium.guilde.website.persistence.util.AbstractRepositoryTest;

public class ResourceRepositoryTest extends AbstractRepositoryTest<ResourceRepository, Resource, Long> {
	
	private static final int RESOURCE_TO_CREATE_APPEARANCE_ORDER = 1;
	private static final String RESOURCE_TO_CREATE_URI = "resourceToCreateUri";
	private static final String RESOURCE_TO_CREATE_NAME = "resourceToCreateName";
	private static final long RESOURCE_TO_FIND_ID = 1L;
	private static final int GUEST_GROUP_ID = 1;
	
	@Autowired
	private ResourceRepository resourceRepository;
	
	@Before
	public void setUpTests() {
		this.id = RESOURCE_TO_FIND_ID;
		this.entity = new Resource();
		this.entity.setAppearanceOrder(RESOURCE_TO_CREATE_APPEARANCE_ORDER);
		this.entity.setName(RESOURCE_TO_CREATE_NAME);
		this.entity.setUri(RESOURCE_TO_CREATE_URI);
	}

	@Test
	public void testFindByGroupsIdOrderByAppearanceOrderAsc() {
		assertTrue(CollectionUtils.isNotEmpty(resourceRepository.findByGroupsIdOrderByAppearanceOrderAsc(GUEST_GROUP_ID)));
	}

}
