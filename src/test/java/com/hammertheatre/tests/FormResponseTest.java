package com.hammertheatre.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.hammertheatre.App;
import com.hammertheatre.models.FormResponse;
import com.hammertheatre.models.FormResponseDao;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class FormResponseTest {

	@Autowired
	private FormResponseDao dao ;

	@Test
	public void testSave() {
		FormResponse fr;
		String name = "David Vu";
		String email = "david.d.vu@sjsu.edu";
		String marketingArea = "Web";
		String ticketDescription = "I need hammertheatre.com/about updated";
		fr = new FormResponse(name,email,marketingArea,ticketDescription);
		
		dao.save(fr);
		
	}
}
