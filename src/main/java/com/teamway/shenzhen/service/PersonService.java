package com.teamway.shenzhen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamway.shenzhen.bean.Person;
import com.teamway.shenzhen.dao.PersonDao;

@Service
public class PersonService {

	@Autowired
	PersonDao persondao;
	public Person checkUser(String username, String password) {
		
		Person person = persondao.getUser(username, password);
		if(person!=null) {
			
			return person;
		}else {
			return null;
		}
		
	}
}
