package oop.bai15.object;

import java.util.ArrayList;
import java.util.List;

public abstract class Student {
    protected int studentID;
    protected String name;
    protected String dob;
    protected int yearofaddun;
    protected double passingCore;
    protected List<Gpa> gpaStudent;

    public Student() {
    }

    public Student(int studentID, String name, String dob, int yearofaddun, double passingCore, List<Gpa> gpaStudent) {
        this.studentID = studentID;
        this.name = name;
        this.dob = dob;
        this.yearofaddun = yearofaddun;
        this.passingCore = passingCore;
        this.gpaStudent = gpaStudent;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getYearofaddun() {
        return yearofaddun;
    }

    public void setYearofaddun(int yearofaddun) {
        this.yearofaddun = yearofaddun;
    }

    public double getPassingCore() {
        return passingCore;
    }

    public void setPassingCore(double passingCore) {
        this.passingCore = passingCore;
    }

    public List<Gpa> getGpaStudent() {
        return gpaStudent;
    }

    public void setGpaStudent(Gpa gpa) {
        this.gpaStudent.add(gpa);
    }

    public abstract Boolean isRegular();
}