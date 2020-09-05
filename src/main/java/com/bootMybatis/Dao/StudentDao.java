package com.bootMybatis.Dao;

import com.bootMybatis.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentDao extends JpaRepository<Student,Integer> {



}
