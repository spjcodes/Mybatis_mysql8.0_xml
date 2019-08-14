package com.spj.mybatis.service;

import com.spj.mybatis.model.Student;
import com.spj.mybatis.utils.GetSqlSessionFactor;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class ServiceMangeImpl implements ServiceManage {

    SqlSession sqlSession = null;

    @Override
    public Student getStudent(int id) {

        sqlSession = GetSqlSessionFactor.getSqlSession();
        Student s = sqlSession.selectOne("selectStudent", id);
        sqlSession.close();
        return s;
    }

    @Override
    public List<Student> getStudentByName(String name) {
        sqlSession = GetSqlSessionFactor.getSqlSession();
        List<Student> sl = sqlSession.selectList("seleteStudentByName", name);
        return sl;
    }

    @Override
    public List<Student> getStudentLikeName(String name) {

        List<Student> sl = new ArrayList<Student>();
        sqlSession = GetSqlSessionFactor.getSqlSession();
        sl = sqlSession.selectList("selectStudnetLikeName",name);
        return sl;
    }

    @Override
    public List<Student> getStudents() {

        List<Student> sl = new ArrayList<Student>();
        sl = null;

        sqlSession = GetSqlSessionFactor.getSqlSession();
        sl = sqlSession.selectList("selectStudents");
        sqlSession.close();
        return sl;
    }

    @Override
    public boolean addStudent(Student student) {

        sqlSession = GetSqlSessionFactor.getSqlSession();
        int s = sqlSession.insert("addStudent", student);
        if (s > 0) {
            //DML操作需要手动提交，mybatis默认关闭了自动提交否则会执行成功但是数据不会提交到数据库
            sqlSession.commit();
            System.out.println("modify info: ......................add sucessful......................");
            return true;
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return false;
    }

    @Override
    public boolean deleteStudent(int id) {

        sqlSession = GetSqlSessionFactor.getSqlSession();
        int flage = sqlSession.delete("deleteStudentFById",id);

        if (flage > 0) {
            //DML操作需要手动提交，mybatis默认关闭了自动提交
            sqlSession.commit();
            return true;
        }
        sqlSession.close();
        return false;
    }

    @Override
    public boolean updateStudent(Student student) {

        sqlSession = GetSqlSessionFactor.getSqlSession();
        int flage = sqlSession.update("updateStudent",student);

        if (flage > 0) {
            //DML操作需要手动提交，mybatis默认关闭了自动提交
            sqlSession.commit();
            return true;
        }

        return false;
    }
}
