package oop.bai15.object;

import java.util.List;

public class ExternalStudent extends Student {
    private String affiliatedPlace;

    public ExternalStudent(int studentID, String name, String dob, int yearofaddun, double passingCore, List<Gpa> gpaStudent, String affiliatedPlace) {
        super(studentID, name, dob, yearofaddun, passingCore, gpaStudent);
        this.affiliatedPlace = affiliatedPlace;
    }

    public String getAffiliatedPlace() {
        return affiliatedPlace;
    }

    public void setAffiliatedPlace(String affiliatedPlace) {
        this.affiliatedPlace = affiliatedPlace;
    }

    @Override
    public Boolean isRegular() {
        return false;
    }
}