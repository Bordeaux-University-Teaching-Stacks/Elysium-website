package fr.elysium.guilde.website.persistence.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.Serializable;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext-persistence-test.xml"})
public abstract class AbstractRepositoryTest<T1 extends JpaRepository<T2, ID>, T2, ID extends Serializable>{
	
	@Autowired
	protected T1 repository;
	
	protected ID id;
	
	protected T2 entity;
	
	@Test
	public void testRead() {
		assertNotNull(repository.findOne(id));
	}
	
	@Test
	public void testList() {
		assertTrue(CollectionUtils.isNotEmpty(repository.findAll()));
	}
	
	@Test
	public void testSave() {
		assertNotNull(repository.save(entity));
	}

}
