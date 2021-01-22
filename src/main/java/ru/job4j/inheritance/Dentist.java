package ru.job4j.inheritance;

import java.time.LocalDate;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String education, LocalDate birthday, int workExperience,
                   String specialization, boolean isWorkAtPrivateClinic, boolean isChildrenDoctor) {
        super(name, surname, education, birthday, workExperience, specialization,
                isWorkAtPrivateClinic, isChildrenDoctor);
    }

    public void sayToOpenMouth() {

    }

    public void pullOutTooth() {

    }
}
