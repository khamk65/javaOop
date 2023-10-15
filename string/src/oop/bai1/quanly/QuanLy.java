package oop.bai1.quanly;

import oop.bai1.doituong.CanBo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLy {
    List<CanBo> canbo;

    public QuanLy() {
        this.canbo = new ArrayList<>();
    }
    public void ThemCanBo(CanBo canbo) {
        this.canbo.add(canbo);
    }
    public List<CanBo> TimKiemCanBo(String name) {
        return this.canbo.stream().filter(canbo -> canbo.getName().contains(name)).collect(Collectors.toList());

    }
    public List<CanBo> DanhSachCanBo() {
        return this.canbo;
    }
}

