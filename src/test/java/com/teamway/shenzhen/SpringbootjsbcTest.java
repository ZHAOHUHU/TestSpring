package com.teamway.shenzhen;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.teamway.shenzhen.bean.Person;
import com.teamway.shenzhen.service.PersonService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootjsbcTest {

	@Autowired
	PersonService p;
	@Test
	public void test() {
		Person user = p.checkUser("猪八戒", "342");
		System.out.println(user.toString());
	}

}
