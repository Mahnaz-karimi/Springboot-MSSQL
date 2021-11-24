package com.SpringbootJava.SpringbootJdbcSql;

import com.SpringbootJava.SpringbootJdbcSql.User.User;
import com.SpringbootJava.SpringbootJdbcSql.User.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.Month;
import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJdbcTemplateSqlApplicationTests {
    /**
     *
     */
    @ org.springframework.beans.factory.annotation.Autowired (required = true)
    private UserRepository userRepository;
    @Before
    public void setUp() throws Exception {
        User user1= new User("Alice","ex.gamil.com", LocalDate.of(2000, Month.JANUARY,5),38);
        User user2= new User("Sara","eex.mail.com", LocalDate.of(2015, Month.MARCH,8),18);
        //save user, verify has ID value after save
        assertNull(user1.getId());
        assertNull(user2.getId());//null before save
        this.userRepository.save(user1);
        this.userRepository.save(user2);
        assertNotNull(user1.getId());
        assertNotNull(user2.getId());
    }
    @Test
    public void testFetchData(){

        /*Test data retrieval*/
        User userA = userRepository.findByName("Alice");
        assertNotNull(userA);
        assertEquals(38,0, userA.getAge());
        /*Get all products, list should only have two*/
        Iterable users = userRepository.findAll();
        int count = 0;
        for(Object p : users){
            count++;
        }
        assertEquals(count, 2);
    }
}
