package com.spj.mybatis.action;

import com.spj.mybatis.model.Student;
import com.spj.mybatis.service.ServiceMangeImpl;
import org.junit.Test;

import java.util.List;

public class PublicAction {

    ServiceMangeImpl serviceMange = new ServiceMangeImpl();

    @Test
    public void getStudent () {
        Student s = serviceMange.getStudent(1);
        System.out.println(s.toString());
    }

    @Test
    public void getStudents() {
        List<Student> sl = serviceMange.getStudents();
        System.out.println("size :" +  sl.size());
        for (Student s : sl) {
            System.out.println( s.toString());;
        }
    }

    @Test
    public void addStudent(){
        Student student = new Student(1,"诺克萨斯之手","98.0","99.8","98.5","男");
        serviceMange.addStudent(student);
    }

    @Test
    public void deleteStudent() {
        boolean flage = serviceMange.deleteStudent(1);
        if (flage != false) {
            System.out.println("info: \n" +  "...................delete operation successful...................");

        }
    }

    @Test
    public void udateStudnet() {

        Student student = new Student(1,"诺克萨斯之手","98.0","99.8","99.5","男");
        if (serviceMange.updateStudent(student)) {
            System.out.println("info \n" + "............update student successful............");
        }
    }
}
