package com.bootMybatis.service;

import com.bootMybatis.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findStudent();
    Object findStudentById(Integer id);
    void saveStudent(Student student);
    void updateStudent(Student student);
    void deleteStudentById(Integer id);


}
