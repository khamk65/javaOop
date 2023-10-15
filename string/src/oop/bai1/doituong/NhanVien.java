package oop.bai1.doituong;

import oop.bai1.doituong.CanBo;

public class NhanVien extends CanBo {
  private   String work;
    public NhanVien(String name, int age, String sex, String address, String work) {
        super(name, age, sex, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
    @Override
    public void showInfor() {
        super.showInfor();
        System.out.println('/' + work);
    }
}
