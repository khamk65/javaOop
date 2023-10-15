package oop.bai13.object;

import oop.bai13.object.Employee;

import java.util.List;

public class Intern extends Employee {
    private String Majors;
    private String Semester;
    private String University_name;

    public Intern() {
    }




    public Intern(String majors, String semester, String university_name) {
        this.Majors = majors;
        this.Semester = semester;
        this.University_name = university_name;
    }

    public Intern(String id, String fullName, String birthDay, String phone, String email, List<Certificate> certifi, String majors, String semester, String university_name) {
        super(id, fullName, birthDay, phone, email, certifi);
        this.Majors = majors;
        this.Semester = semester;
        this.University_name = university_name;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        this.Majors = majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        this.Semester = semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        this.University_name = university_name;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "Majors='" + Majors + '\'' +
                ", Semester='" + Semester + '\'' +
                ", University_name='" + University_name + '\'' +
                ", Id='" + getId() + '\'' +
                ", FullName='" + getFullName() + '\'' +
                ", BirthDay='" + getBirthDay() + '\'' +
                ", Phone='" + getPhone() + '\'' +
                ", Email='" + getEmail() + '\'' +
                ", Certificates=" + getCertifi() +
                '}';
    }




}
