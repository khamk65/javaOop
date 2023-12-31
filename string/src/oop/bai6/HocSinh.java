package oop.bai6;

public class HocSinh {
    protected String name;
    protected int age;

    public HocSinh(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected String address;
    @Override
    public String toString(){
        return name+" "+age+" "+address;
    }
}
