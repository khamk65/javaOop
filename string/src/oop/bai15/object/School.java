package oop.bai15.object;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> school;

    public School(String name) {
        this.name = name;
        this.school = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getSchool() {
        return school;
    }

    public void AddStudent(Student sch) {
        this.school.add(sch);
    }
}