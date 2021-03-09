package ru.job4j.inheritance;

import java.time.LocalDate;

public class Engineer extends Profession {
    private String specialization;
    private boolean isWorkAtOffice;
    private int category;

    public Engineer(
            String name, String surname, String education, LocalDate birthday,
            String specialization, boolean isWorkAtOffice, int category
    ) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
        this.isWorkAtOffice = isWorkAtOffice;
        this.category = category;
    }

    public void readTechnicalDocumentation() {

    }

    public void developProduct() {

    }
}
