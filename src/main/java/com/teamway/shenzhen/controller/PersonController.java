package com.teamway.shenzhen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teamway.shenzhen.bean.Person;
import com.teamway.shenzhen.dao.PersonDao;
import com.teamway.shenzhen.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	PersonDao persondao;
	@RequestMapping("/")
	public String gotoindxx() {
		
		return "index";
	}

	@PostMapping("/person")
	public String checkoutUser(String username, String password) {
		Person user = persondao.getUser(username, password);
		System.out.println(user);
		if (user!= null) {

			return "success";
		}
		return "mama";

	}
}
