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
    public void teacherRateTask(Teacher teacher,Response response, String result,String comment,Date date){
        marks.add(teacher.markTask(response,result,comment,date) );
    }

    public void studentResponseToTask(Student student,Task task, String text, Date date){
    responses.add(student.responseToTask(task,text,date) );
    }




    public void printStudents(){
        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i).id+" "+students.get(i).name+" "
                    +students.get(i).password+" "+students.get(i).group);
        }
    }

    public void printTeachers(){
        for (int i=0;i<teachers.size();i++){
            System.out.println(teachers.get(i).id+" "+teachers.get(i).name+
                    " "+teachers.get(i).password+" "+teachers.get(i).course);
        }
    }

    public void printTasks(){
        for(int i=0;i<tasks.size();i++){
            System.out.println(tasks.get(i).name+" "+tasks.get(i).text+" "+
                    tasks.get(i).group+" "+tasks.get(i).begin+" "+tasks.get(i).end);
        }
    }
    public void printResponses(){
        for(int i=0;i<responses.size();i++){
            System.out.println(responses.get(i).taskName+" "+responses.get(i)
                    .studentName+" "+responses.get(i).responseText+" "+responses.get(i).responseDate);
        }
    }

    public void printMarks(){
        for(int i=0;i<marks.size();i++){
            System.out.println(responses.get(i).taskName+" "+responses.get(i).studentName+" "+responses.get(i).
                    Teacher_id+" "+responses.get(i).comments+" "+responses.get(i).result+" "+responses.get(i).replyDate);
        }
    }
}
