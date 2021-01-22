package ru.job4j.inheritance;

import java.time.LocalDate;

public class Programmer extends Engineer {
    private String programLanguage;

    public Programmer(String name, String surname, String education, LocalDate birthday,
                      String specialization, boolean isWorkAtOffice, int category) {
        super(name, surname, education, birthday, specialization, isWorkAtOffice, category);
    }

    public void testSoftware() {

    }

    public void writeCode() {

    }
}
