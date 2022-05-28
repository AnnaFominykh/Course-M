package com.company;

import java.util.Date;

public class Teacher {
     int id;
    String name;
    String password;
    String course;
    //отсустствие Getters и Setters.
    public Task createTask(String name, String text, String group, Date begin, Date end){
        Task newTask= new Task();
        newTask.begin=begin;
        newTask.group=group;
        newTask.end=end;
        newTask.text=text;
        newTask.name=name;
        return  newTask;
    }
    public Response markTask (Response response, String result,String comment,Date date){
        Response test= new Response();
        test.result=result;
        test.taskName=response.taskName;
        test.Teacher_id=this.id;
        test.TeacherName=this.name;
        test.comments=comment;
        test.studentName=response.studentName;
        test.studentId=response.studentId;
        test.replyDate=date;
        return test;

    }
//Из-за наличия общих переменных классы Response и Mark можно объеденить.
}
