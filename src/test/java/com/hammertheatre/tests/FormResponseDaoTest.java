package com.hammertheatre.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.hammertheatre.App;
import com.hammertheatre.models.FormResponseDao;
import com.hammertheatre.models.FormResponseDaoService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class FormResponseDaoTest {
	
	@Autowired
	private FormResponseDao dao;
	
	@Autowired
	private FormResponseDaoService sDao;

	@Test
	public void testfindByMarketingArea() {
		System.out.println(dao.findByMarketingArea("Graphic Design"));
		System.out.println(sDao.findAllUpTo(3));
	}
	
}
