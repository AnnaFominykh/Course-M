package com.company;

import java.util.Date;

public class Student{
    int id;
    String name;
    String password;
    String group;
//отсустствие Getters и Setters.

    public Response responseToTask (Task task, String text, Date date)
    {
        Response studentResponse= new Response();
        studentResponse.responseDate=date;
        studentResponse.responseText=text;
        studentResponse.studentName=this.name;
        studentResponse.studentId=this.id;
        studentResponse.taskName=task.name;
        studentResponse.taskId=task.task_id;



        return studentResponse;
    }
}
