package com.company;

import java.util.Date;

public class Student {
    private int Student_id;
   private String name;
    private String password;
    private String group;

    public int getStudent_Id()
    {
     return Student_id;
    }

    public void setStudent_Id(int S_id) {
        this.Student_id = S_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Response responseToTask (Task task, String text, Date date){
        Response studentResponse= new Response();
        studentResponse.setResponseDate(date);
        studentResponse.setResponseText(text);
        studentResponse.setStudentName(this.name);
        studentResponse.getStudentId(this.Student_id);
        studentResponse.setTaskName(task.getName());
        studentResponse.setTaskId(task.getTask_id());
        return studentResponse;
    }
}
