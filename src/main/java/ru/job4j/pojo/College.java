package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Smirnov Vladimir Ivanovich");
        student.setGroup("Number 10");
        student.setCreated(new Date());
        System.out.println(student.getName() + " from group " + student.getGroup() + " entered : " + student.getCreated());
    }
}
