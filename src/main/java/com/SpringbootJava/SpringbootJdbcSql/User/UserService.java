package com.SpringbootJava.SpringbootJdbcSql.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private  JdbcTemplate jdbcTemplate;

    public List<User> getUsers(){
        return List.of(
                new User(
                        1L,
                        "Mahnaz",
                        "exemplem@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21
                )
        );
    }

    public List<User> getUsersFromDB(){

        String sql = "SELECT * FROM Student";
        List<User> users = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(User.class));
        users.forEach(System.out :: println);
        return users;
    }

    public User getUser(long id){
        return new User(
                1L,
                "Mahnaz",
                "exemplem@gmail.com",
                LocalDate.of(2000, Month.JANUARY,5),
                21
        );
    }
}


