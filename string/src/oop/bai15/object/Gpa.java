package oop.bai15.object;

public class Gpa {
    private double name;
    private double gpa;

    public Gpa() {
    }

    public Gpa(double name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}