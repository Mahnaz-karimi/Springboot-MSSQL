package com.SpringbootJava.SpringbootJdbcSql.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;


@RestController
public class UserController {

    private final UserService userService;

    private UserRepository userRepository;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(path ="api/v1/users" ) // http://127.0.0.1:8080/api/v1/users
    public List<User> getUsers() {return userService.getUsers(); }

    @GetMapping("api/v1/users/{id}")
    User one(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping(value = "api/v1/user")
    User newUser( User newUser) {
        return userRepository.save(new User(
                1L,
                "Mahnaz",
                "exemplem@gmail.com",
                LocalDateTime.of(2000, Month.JANUARY,5,20,30),
                21
        ));
    }

}
