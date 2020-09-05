package com.bootMybatis.cui;

import com.bootMybatis.entity.User;
import com.bootMybatis.service.UserService;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class AooAppTests {
    @Resource
    UserService userService;

    @Test
    public void test(){
        List<User> lists = userService.findAll();
        for (User user: lists
        ) {
            System.out.println(user);
        }
    }
}


