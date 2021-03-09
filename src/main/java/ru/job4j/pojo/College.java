package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan");
        student.setGroup("KIM-1-2");
        student.setEnrollmentDate(new Date());
        System.out.println("Student: " + student.getFullName());
        System.out.println("Group: " + student.getGroup());
        System.out.printf(
                "%1$s %2$td.%2$tm.%2$tY", "Enrollment date:", student.getEnrollmentDate()
        );
    }
}
