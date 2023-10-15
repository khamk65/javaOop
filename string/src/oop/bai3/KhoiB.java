package oop.bai3;

public class KhoiB extends ThiSinh{
    private String khoi="B";

    public String getKhoi() {
        return khoi;
    }

    public KhoiB(String sbd, String name, String address, String buff) {
        super(sbd, name, address, buff);
    }
    @Override
    public String toString(){
        return sbd+" " +name+" "+address+" "+ khoi;
    }
}
