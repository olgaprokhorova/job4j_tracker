package ru.job4j.inheritance;

import java.time.LocalDate;

public class Builder extends Engineer {
    public Builder(String name, String surname, String education, LocalDate birthday, String specialization,
                   boolean isWorkAtOffice, int category) {
        super(name, surname, education, birthday, specialization, isWorkAtOffice, category);
    }

    public void designBuilding() {

    }

    public void makeEstimate() {

    }

    public void checkQualityOfConstructionMaterials() {

    }
}
