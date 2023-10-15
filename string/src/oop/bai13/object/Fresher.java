package oop.bai13.object;

import oop.bai13.object.Employee;

import java.util.List;
import java.util.Map;

public class Fresher extends Employee {
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;

    public Fresher() {
    }



    public Fresher(String graduation_date, String graduation_rank, String education) {
        this.Graduation_date = graduation_date;
        this.Graduation_rank = graduation_rank;
        this.Education = education;
    }

    public Fresher(String id, String fullName, String birthDay, String phone, String email, List<Certificate> certifi, String graduation_date, String graduation_rank, String education) {
        super(id, fullName, birthDay, phone, email, certifi);
        this.Graduation_date = graduation_date;
        this.Graduation_rank = graduation_rank;
        this.Education = education;
    }

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        this.Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        this.Education = education;
    }



    @Override
    public String toString() {
        return "Fresher{" +
                "Id='" + getId() + '\'' +
                ", FullName='" + getFullName() + '\'' +
                ", BirthDay='" + getBirthDay() + '\'' +
                ", Phone='" + getPhone() + '\'' +
                ", Email='" + getEmail() + '\'' +
                ", Certificates=" + getCertifi() +
                ", Graduation_date='" + Graduation_date + '\'' +
                ", Graduation_rank='" + Graduation_rank + '\'' +
                ", Education='" + Education + '\'' +
                '}';
    }

}
