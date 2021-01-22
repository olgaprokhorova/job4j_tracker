package ru.job4j.inheritance;

import java.time.LocalDate;

public class Doctor extends Profession {
    private int workExperience;
    private String specialization;
    private boolean isWorkAtPrivateClinic;
    private boolean isChildrenDoctor;

    public Doctor(String name, String surname, String education, LocalDate birthday, int workExperience,
                  String specialization, boolean isWorkAtPrivateClinic, boolean isChildrenDoctor) {
        super(name, surname, education, birthday);
        this.workExperience = workExperience;
        this.specialization = specialization;
        this.isWorkAtPrivateClinic = isWorkAtPrivateClinic;
        this.isChildrenDoctor = isChildrenDoctor;
    }

    public void examinePatient() {

    }

    public void treatPatient() {

    }

    public void writeOutPrescription() {

    }

    public void putOnWhiteCoat() {

    }


}
