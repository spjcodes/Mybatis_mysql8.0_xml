package com.spj.mybatis.dao;

import com.spj.mybatis.model.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 接口式编程
 */
public interface StudentDao {
    public List<Student> getStudentsi();

//    java注解
    @Select("select * from student")
    public List<Student> getStudentsi1();
}
