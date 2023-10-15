package oop.bai3;

public class KhoiC extends ThiSinh{
    private String khoi="C";

    public String getKhoi() {
        return khoi;
    }

    public KhoiC(String sbd, String name, String address, String buff) {
        super(sbd, name, address, buff);
    }
    @Override
    public String toString(){
      return sbd+" " +name+" "+address+" "+ khoi;
    }
}
