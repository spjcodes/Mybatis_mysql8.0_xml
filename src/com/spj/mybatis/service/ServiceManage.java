package com.spj.mybatis.service;

import com.spj.mybatis.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface ServiceManage {

    public Student getStudent(int id);
    public List<Student> getStudentByName(String name);
    public List<Student> getStudentLikeName(String name);
    public List<Student> getStudents();
    public boolean addStudent(Student student);
    public boolean deleteStudent(int id);
    public boolean updateStudent(Student student);


}
