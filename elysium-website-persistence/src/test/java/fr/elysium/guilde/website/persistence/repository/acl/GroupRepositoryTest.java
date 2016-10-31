package fr.elysium.guilde.website.persistence.repository.acl;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import fr.elysium.guilde.website.persistence.entity.acl.Group;
import fr.elysium.guilde.website.persistence.repository.acl.GroupRepository;
import fr.elysium.guilde.website.persistence.util.AbstractRepositoryTest;

public class GroupRepositoryTest extends AbstractRepositoryTest<GroupRepository, Group, Integer>{

	private static final String GROUP_TO_FIND_NAME = "groupToFindName";
	private static final int GROUP_TO_FIND_ID = 1;
	
	@Autowired
	private GroupRepository groupRepository;
	
	@Before
	public void setUpTests() {
		this.id = GROUP_TO_FIND_ID;
		this.entity = new Group();
		this.entity.setName(GROUP_TO_FIND_NAME);
	}

}
