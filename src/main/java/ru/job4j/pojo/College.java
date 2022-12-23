package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setLastname("Салихов");
        student.setFirstname("Радмир");
        student.setPatronymic("Фаритович");
        student.setGroup("n12");
        student.setDateofentry(new Date());
        System.out.println("Студент: " + student.getLastname() + " " + student.getFirstname() + " "
                + student.getPatronymic() + ", группа: " + student.getGroup() + ", дата зачисления: " + student.getDateofentry());
    }
}
