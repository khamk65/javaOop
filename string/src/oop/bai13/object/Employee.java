package oop.bai13.object;

import java.util.List;
import java.util.Map;

public abstract class Employee {
    protected String Id;
    protected String FullName;
    protected String BirthDay;
    protected String Phone;
    protected String Email;


    protected List<Certificate> Certifi;
    public static int Employee_count = 0;

    public Employee() {
    }

    public Employee(String id, String fullName, String birthDay, String phone, String email, List<Certificate> certifi) {
        this.Id = id;
        this.FullName = fullName;
        this.BirthDay = birthDay;
        this.Phone = phone;
        this.Email = email;
        this.Certifi = certifi;
        this.Employee_count++;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        this.BirthDay = birthDay;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }


    public static int getEmployee_count() {
        return Employee_count;
    }


    public List<Certificate> getCertifi() {
        return Certifi;
    }

    public void setCertifi(List<Certificate> certifi) {
        this.Certifi = certifi;
    }



}

