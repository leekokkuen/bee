package kok.lee.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bee.model.Person;
import bee.service.PersonServiceI;

import org.apache.log4j.Logger;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestMybatis {

	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	private PersonServiceI upersonService;

	public PersonServiceI getPersonService() {
		return upersonService;
	}

	@Autowired
	public void setPersonService(PersonServiceI upersonService) {
		this.upersonService = upersonService;
	}

	@Test
	public void test1() {
		Person u = new Person("155","liuhui");
		upersonService.insert(u);
	}

}
