package com.SpringbootJava.SpringbootJdbcSql;

import com.SpringbootJava.SpringbootJdbcSql.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootJdbcTemplateSqlApplication implements CommandLineRunner {

	@Autowired
	private UserService us;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcTemplateSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		us.getUsersFromDB();
	}

}
