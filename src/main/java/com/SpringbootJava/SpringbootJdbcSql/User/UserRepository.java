package com.SpringbootJava.SpringbootJdbcSql.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface UserRepository extends CrudRepository<User, String> {
    User findByName(String name);
    User findById(long id);

}
