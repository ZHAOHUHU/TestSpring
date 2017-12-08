package com.teamway.shenzhen.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.teamway.shenzhen.bean.Person;

@Repository
public class PersonDao {
	@Autowired
	private JdbcTemplate conn;

	public Person getUser(String name, String password) {
		String sql = "select * from girl where username=?and password=?";
		Object obj[] = { name, password };
		Map<String, Object> map = null;
		try {
			map = conn.queryForMap(sql, obj);
return new Person((String)map.get("username"), (String)map.get("password"));
		} catch (EmptyResultDataAccessException e) {
			// System.out.println(e);
			return null;
		}

	}

}
