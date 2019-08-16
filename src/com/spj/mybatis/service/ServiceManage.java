package com.spj.mybatis.service;

import com.spj.mybatis.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ServiceManage {

    public Student getStudent(int id);
    public List<Student> getStudentByName(String name);
    public List<Student> getStudentLikeName(String name);
    public List<Student> getStudentByINfo(Student student);
    public List<Student> getStudentLikeINfo(Student student);
    public List<Student> getStudentLike(String name);
    public List<Student> getStudentLike(Student student);
    public List<Student> getStudentByStudentInfo(Student student);
    public List<Student> getStudents();

    public List<Student> getStudentsi();
    public List<Student> getStudentsi1();

    public boolean addStudent(Student student);
    public boolean addStudentByStudents(Map sm);
    public boolean addStudentByStudents(List<Student> sl);
    public boolean deleteStudent(int id);
    public boolean updateStudent(Student student);



}
