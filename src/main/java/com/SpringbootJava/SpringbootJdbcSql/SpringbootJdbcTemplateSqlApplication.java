package com.SpringbootJava.SpringbootJdbcSql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController
public class SpringbootJdbcTemplateSqlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcTemplateSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM Student";
		// String sql = "INSERT INTO Student (id, name, email, dob, age) Values (1, 'mahnaz', 'mmm@email.com','2000-01-05', 15)";

	}

}
