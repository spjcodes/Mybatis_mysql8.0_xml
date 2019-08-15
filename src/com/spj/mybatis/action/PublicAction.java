package com.spj.mybatis.action;

import com.spj.mybatis.model.Student;
import com.spj.mybatis.service.ServiceMangeImpl;
import org.junit.Test;

import java.util.ArrayList;
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

    @Test
    public void getStudetByName() {

        String NameKeyWord = "德玛";
        List<Student> sl = serviceMange.getStudentByName(NameKeyWord);
        for (Student s : sl) {
            System.out.println(s.toString());
        }

    }

    @Test
    public  void getStudnetLikeName() {

        String NameKeyWord = "之";
        List<Student> sl = serviceMange.getStudentLikeName(NameKeyWord);
        for (Student s : sl) {
            System.out.println(s.toString());
        }
    }


    @Test
    public void getStudnetsByInfo() {
        Student student = new Student(0,"德玛西亚之力",null,null,null,null);
        Student student1 = new Student(6,"德玛西亚之力",null,null,null,null);
        ArrayList<Student> sl = (ArrayList<Student>) serviceMange.getStudentByINfo(student);
        System.out.println("..........................一个查询条件..........................");
        for ( Student s : sl) {
            System.out.println(s.toString());
        }
        System.out.println();
        System.out.println("..........................两个查询条件..........................");
        ArrayList<Student> sl1 = (ArrayList<Student>) serviceMange.getStudentByINfo(student1);
        for ( Student s : sl1) {
            System.out.println(s.toString());
        }
    }

    @Test
    public void getStudnetsLikeInfo() {
        Student student = new Student(0,"",null,
                null,null,null);
        Student student2 = new Student(0,"",null,
                null,null,"女");
        Student student1 = new Student(6,"德玛",null,
                null,null,"女");

        ArrayList<Student> sl = (ArrayList<Student>) serviceMange.getStudentLikeINfo(student);
        System.out.println("..........................默认查询条件..........................");
        for ( Student s : sl) {
            System.out.println(s.toString());
        }

        System.out.println();
        System.out.println("..........................第一个查询条件..........................");
        ArrayList<Student> sl1 = (ArrayList<Student>) serviceMange.getStudentLikeINfo(student1);
        for ( Student s : sl1) {
            System.out.println(s.toString());
        }
        System.out.println();
        System.out.println("..........................第二个查询条件..........................");
        ArrayList<Student> sl2 = (ArrayList<Student>) serviceMange.getStudentLikeINfo(student2);
        for ( Student s : sl2) {
            System.out.println(s.toString());
        }
    }

    @Test
    public void selectStudentByStudentInfo() {
        Student student = new Student(0,"德玛西亚之力",null,
                null,null,null);
        Student student1 = new Student(0,"",null,
                null,null,null);
        List<Student> studentList = serviceMange.getStudentByStudentInfo(student);
        for (Student s : studentList) {
            System.out.println(s.toString());
        }
        System.out.println();
        System.out.println("...........................................................");
        System.out.println();

        List<Student> studentList1 = serviceMange.getStudentByStudentInfo(student1);
        for (Student s : studentList1) {
            System.out.println(s.toString());
        }
    }

    @Test
    public void addStudents(){
        List<Student> sl = new ArrayList<Student>();
        Student s = new Student(20,"冰霜女巫","99.3","99.3","99.3","女");
        Student s1 = new Student(21,"仙灵女巫","99.3","99.3","99.3","女");
        Student s2 = new Student(22,"蒸汽机器人","99.3","99.3","99.3","男");
        sl.add(s);
        sl.add(s1);
        sl.add(s2);
        serviceMange.addStudentByStudents(sl);
    }

    @Test
    public void getStudentSLikeSring() {
        ArrayList<Student> sl = (ArrayList<Student>) serviceMange.getStudentLike(new Student(20,"女巫","99.3","99.3","99.3","女"));
        for (Student s : sl) {
            System.out.println(s.toString());
        }
    }

    @Test
    public void getStudentSLikeSring1() {
        ArrayList<Student> sl = (ArrayList<Student>) serviceMange.getStudentLike("力");
        for (Student s : sl) {
            System.out.println(s.toString());
        }
    }

}
