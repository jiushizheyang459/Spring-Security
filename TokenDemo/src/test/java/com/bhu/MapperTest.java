package com.bhu;

import com.bhu.domain.User;
import com.bhu.mapper.MenuMapper;
import com.bhu.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void TestBCryptPasswordEncoder(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("1234");
        String encode2 = passwordEncoder.encode("1234");
        System.out.println(encode);
        System.out.println(encode2);
//        System.out.println(passwordEncoder.matches("1234",
//                "$2a$10$nwGe8sFAsz.r0t/Q7jA6vuPjddm0stMmFJ3MLE432oii1//EOvgtC"));
    }

    @Test
    public void testSelectPermsByUserId(){
        List<String> perms = menuMapper.selectPermsByUserId(2L);
        perms.forEach(System.out::println);

    }

    @Test
    public void testUserMapper(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
