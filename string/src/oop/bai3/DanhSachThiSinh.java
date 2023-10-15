package oop.bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DanhSachThiSinh {
    public DanhSachThiSinh() {
        this.thisinh = new ArrayList<>();
    }

    private List<ThiSinh> thisinh;

    public void ThemThisinh(ThiSinh thisinh) {
        this.thisinh.add(thisinh);
    }
    public List<ThiSinh> TimKiemThiSinh(String sbd){

        return this.thisinh.stream().filter(canbo->canbo.getSbd().contains(sbd)).collect(Collectors.toList());

    }
    public void DanhSachThiSinh(){
        this.thisinh.forEach(canbo-> System.out.println(canbo.toString()));
    }
}
