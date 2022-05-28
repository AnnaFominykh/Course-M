package com.company;

public class Admin {
    public Student createStudent(int id, String name,String group,String password){
        Student newStudent= new Student();
        newStudent.setGroup(group);
        newStudent.setStudent_Id(id);
        newStudent.setName(name);
        newStudent.setPassword(password);
        return  newStudent;
    }

    public Teacher createTeacher(int id, String name,String course ,String password){
        Teacher newTeacher= new Teacher();
        newTeacher.setCourse(course);
        newTeacher.setTeacher_id(id);
        newTeacher.setName(name);
        newTeacher.setPassword(password);
        return  newTeacher;
    }

}
