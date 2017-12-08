package com.teamway.shenzhen.bean;


public class Person {
	@Override
	public String toString() {
		return "Person [name=" + name + ", password=" + password + "]";
	}

	private String name;
	private String password;

	public Person(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

}
