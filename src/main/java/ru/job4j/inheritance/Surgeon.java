package ru.job4j.inheritance;

import java.time.LocalDate;

public class Surgeon extends Doctor {
    public Surgeon(
            String name, String surname, String education, LocalDate birthday,
            int workExperience, String specialization, boolean isWorkAtPrivateClinic
    ) {
        super(name, surname, education, birthday, workExperience, specialization,
                isWorkAtPrivateClinic);
    }

    public void overcastSeam() {

    }

    public void makeIncision() {

    }
}
