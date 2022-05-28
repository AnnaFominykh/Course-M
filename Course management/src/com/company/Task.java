package com.company;

import java.util.Date;

public class Task {
    int task_id;
    String name;
    String text;
    String group;
    Date begin;
    Date end;
}//отсустствие Getters и Setters. Может привести к накоплению лишней информации, и случайной смене значения переменных.

//Добавить id для опознания заданий в случае повторений.