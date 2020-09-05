package com.bootMybatis.service.impl;

import com.bootMybatis.Dao.StudentDao;
import com.bootMybatis.entity.Student;
import com.bootMybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentDao studentDao;

    @Override
    public List<Student> findStudent() {

        return studentDao.findAll();
    }

    @Override
    public Student findStudentById(Integer id) {

        return (Student) studentDao.getOne(id);
    }

    @Override
    public void saveStudent(Student student) {

        studentDao.save(student);
    }

    @Override
    public void updateStudent(Student student) {

        studentDao.save(student);
    }

    @Override
    public void deleteStudentById(Integer id) {

        studentDao.deleteById(id);
    }
}
