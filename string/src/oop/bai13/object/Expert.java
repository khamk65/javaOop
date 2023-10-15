package oop.bai13.object;

import oop.bai13.object.Employee;

import java.util.List;

public class Expert extends Employee {
    private int ExpInYear;
    private String ProSkill;

    public Expert() {
    }



    public Expert(int expInYear, String proSkill) {
        this.ExpInYear = expInYear;
        this.ProSkill = proSkill;
    }

    public Expert(String id, String fullName, String birthDay, String phone, String email, List<Certificate> certifi, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, certifi);
        this.ExpInYear = expInYear;
        this.ProSkill = proSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        this.ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        this.ProSkill = proSkill;
    }


    @Override
    public String toString() {
        return "Expert{" +
                "Id='" + getId() + '\'' +
                ", FullName='" + getFullName() + '\'' +
                ", BirthDay='" + getBirthDay() + '\'' +
                ", Phone='" + getPhone() + '\'' +
                ", Email='" + getEmail() + '\'' +
                ", Certificates=" + getCertifi() +
                ", ExpInYear=" + ExpInYear +
                ", ProSkill='" + ProSkill + '\'' +
                '}';
    }


}