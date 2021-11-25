package com.SpringbootJava.SpringbootJdbcSql.User;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Service
public class UserService {

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


