package com.company;

public class Admin {

    public Student createStudent(int id, String name,String group,String password){
        Student newStudent= new Student();
        newStudent.group=group;
        newStudent.id=id;
        newStudent.name=name;
        newStudent.password=password;
        return  newStudent;
    }

    public Teacher createTeacher(int id, String name,String course ,String password){
        Teacher newTeacher= new Teacher();
        newTeacher.course=course;
        newTeacher.id=id;
        newTeacher.name=name;
        newTeacher.password=password;
        return  newTeacher;
    }
}
