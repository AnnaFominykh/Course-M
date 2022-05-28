package com.company;

import java.util.ArrayList;
import java.util.Date;

public class CourseManagment
{
    ArrayList<Student> students =new ArrayList<>();
    ArrayList<Teacher> teachers =new ArrayList<>();
    ArrayList<Task> tasks =new ArrayList<>();
    ArrayList<Response> responses =new ArrayList<>();
    ArrayList<Response> marks =new ArrayList<>();

    public void adminCreateTeacher (int id, String name,String course ,String password ){
        Admin admin= new Admin();
       teachers.add( admin.createTeacher(id,name,course,password) );
    }

    public void adminCreateStudent (int id, String name,String group,String password ){
        Admin admin= new Admin();
        students.add( admin.createStudent(id,name,group,password) );
    }

    public void teacherCreateTask(Teacher teacher , String name, String text, String group, Date begin, Date end ){
        tasks.add(teacher.createTask(name,text,group,begin,end) );
    }
    public void teacherRateTask(Teacher teacher, Student student, Task task, String result,String comment,Date date){
        marks.add(teacher.markTask(student,task,result,comment,date) );
    }

    public void studentResponseToTask(Student student,Task task, String text, Date date){
        responses.add(student.responseToTask(task,text,date) );
    }

    public void printStudents(){
        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i).getStudent_Id()+" "+students.get(i).getName()+" "+
                    students.get(i).getPassword()+" "+students.get(i).getGroup());
        }
    }

    public void printTeachers(){
        for (int i=0;i<teachers.size();i++){
            System.out.println(teachers.get(i).getTeacher_id()+" "+teachers.get(i).getName()+" "+
                    teachers.get(i).getPassword()+" "+teachers.get(i).getCourse());
        }
    }

    public void printTasks(){
        for(int i=0;i<tasks.size();i++){
            System.out.println(tasks.get(i).getName()+" "+tasks.get(i).getText()+" "+tasks.get(i).getGroup()+" "+
                    tasks.get(i).getBegin()+" "+tasks.get(i).getEnd());
        }
    }
    public void printResponses(){
        for(int i=0;i<responses.size();i++){
            System.out.println(responses.get(i).getTaskName()+" "+responses.get(i).getStudentName()+" "+
                    responses.get(i).getResponseText()+" "+responses.get(i).getResponseDate());
        }
    }

    public void printMarks(){
        for(int i=0;i<marks.size();i++){
            System.out.println(marks.get(i).getTaskName()+" "+marks.get(i).getStudentName()+" "+marks.get(i).getTeacherName()+" "+marks.get(i).getComments()+" "+
                    marks.get(i).getResult()+" "+marks.get(i).getReplyDate());
        }
    }
}
