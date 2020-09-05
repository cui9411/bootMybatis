package com.bootMybatis.service;

import com.bootMybatis.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {


    public List<User> findAll();

}
