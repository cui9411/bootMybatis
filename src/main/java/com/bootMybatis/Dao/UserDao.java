package com.bootMybatis.Dao;

import com.bootMybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;



public interface UserDao {


    public List<User> findAll();


}
