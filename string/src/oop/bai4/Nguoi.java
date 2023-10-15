package oop.bai4;

public class Nguoi {
    protected String name;
    protected int age;
    protected String  profession;
    protected String cmnd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Nguoi(String name, int age, String profession, String cmnd) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.cmnd = cmnd;
    }
@Override
    public String toString (){
        return name+" "+age+" "+profession+" "+cmnd;
    }
}
