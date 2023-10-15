package oop.bai3;

public class ThiSinh {
protected String sbd;
protected String name;
protected String address;
protected String buff;

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuff() {
        return buff;
    }

    public ThiSinh(String sbd, String name, String address, String buff) {
        this.sbd = sbd;
        this.name = name;
        this.address = address;
        this.buff = buff;
    }

    public void setBuff(String buff) {
        this.buff = buff;
    }
}
