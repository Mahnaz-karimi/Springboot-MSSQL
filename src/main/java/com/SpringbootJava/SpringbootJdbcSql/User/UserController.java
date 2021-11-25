package com.SpringbootJava.SpringbootJdbcSql.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
// @RequestMapping(path ="api/v1/users" ) // http://127.0.0.1:8080/api/v1/users
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(path ="api/v1/users" )
    public List<User> getUsers() {return userService.getUsers(); }

    @GetMapping("api/v1/users/{id}")
    User one(@PathVariable Long id) {

        return userService.getUser(id);
    }


}
