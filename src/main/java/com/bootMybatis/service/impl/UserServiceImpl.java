package com.bootMybatis.service.impl;

import com.bootMybatis.entity.User;

import com.bootMybatis.Dao.UserDao;

import com.bootMybatis.service.UserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

 @Resource
 UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
