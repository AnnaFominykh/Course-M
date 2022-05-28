package com.company;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args) throws ParseException {
        CourseManagment managment=new CourseManagment();

        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
        Date begin =format1.parse("05/01/1999");
        Date end =format1.parse("05/22/1999");


        managment.adminCreateTeacher(1,"Teacher1","AUBP-19-1","asdq");
        managment.teacherCreateTask(managment.teachers.get(0),"Test",
                "Write tests","AUBP-19-1",begin,end );
        managment.printTeachers();
        managment.printTasks();
        managment.printMarks();
    }
}
