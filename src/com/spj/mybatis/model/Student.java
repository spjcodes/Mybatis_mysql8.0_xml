package com.spj.mybatis.model;

public class Student {

    int id;
    String name;
    String english;
    String math;
    String java;
    String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int id, String name, String english, String math, String java, String sex) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
        this.java = java;
        this.sex = sex;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", english='" + english + '\'' +
                ", math='" + math + '\'' +
                ", java='" + java + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
