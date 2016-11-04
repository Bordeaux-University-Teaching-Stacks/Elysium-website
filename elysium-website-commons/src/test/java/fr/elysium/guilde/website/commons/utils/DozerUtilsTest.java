package fr.elysium.guilde.website.commons.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.junit.BeforeClass;
import org.junit.Test;

public class DozerUtilsTest {
	
	private Mapper mapper = new DozerBeanMapper();
	
	private static List<Object> objectList = new ArrayList<Object>();
	
	@BeforeClass
	public static void setUp() {
		objectList.add(new Object());
	}

	@Test
	public void testMapList() {
		assertTrue(CollectionUtils.isNotEmpty(DozerUtils.map(mapper, objectList, Object.class)));
	}

}
