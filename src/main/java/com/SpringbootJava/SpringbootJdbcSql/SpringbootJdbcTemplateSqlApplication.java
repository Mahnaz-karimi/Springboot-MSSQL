package com.SpringbootJava.SpringbootJdbcSql;

import com.SpringbootJava.SpringbootJdbcSql.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@SpringBootApplication
@RestController
public class SpringbootJdbcTemplateSqlApplication implements CommandLineRunner {

	@Autowired
	private  JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcTemplateSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM Student";
		List<User> users = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(User.class));

		users.forEach(System.out :: println);
	}

}
