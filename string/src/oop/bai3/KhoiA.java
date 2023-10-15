package oop.bai3;

public class KhoiA extends ThiSinh{
    private String khoi="A";

    public String getKhoi() {
        return khoi;
    }

    public KhoiA(String sbd, String name, String address, String buff) {
        super(sbd, name, address, buff);
    }
    @Override
    public String toString(){
        return sbd+" " +name+" "+address+" "+ khoi;
    }
}
