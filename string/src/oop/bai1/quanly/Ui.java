package oop.bai1.quanly;

import oop.bai1.doituong.CanBo;
import oop.bai1.doituong.CongNhan;
import oop.bai1.doituong.KySu;
import oop.bai1.doituong.NhanVien;

import java.util.List;
import java.util.Scanner;

public class Ui {
    private QuanLy quanly;
    private Scanner sc;

    public Ui() {
        this.quanly = new QuanLy();
        this.sc = new Scanner(System.in);
    }

    public void ThemCanBo() {
        System.out.println("thêm cán bộ");
        System.out.print("nhập tên");
        String name = sc.nextLine();
        System.out.print("nhập tuổi");
        int age = sc.nextInt();
        System.out.print("nhập địa chỉ");
        String address = sc.nextLine();
        sc.nextLine();
        System.out.print("nhâpj giới tính");
        String sex = sc.nextLine();
        System.out.print("cán bộ cần nhập: 0-Công nhân,1-Kỹ Sư,2-Nhân Viên");
        int type = sc.nextInt();
        sc.nextLine();
        if (type == 0) {
            System.out.print("nhập vào leve của công nhập(1->10)");
            int leve = sc.nextInt();
            CanBo congnhan = new CongNhan(name, age, sex, address, leve);
            quanly.ThemCanBo(congnhan);
        } else if (type == 1) {
            System.out.print("Nhập vào chuyên ngành của kỹ sư");
            String branch = sc.nextLine();
            CanBo kysu = new KySu(name, age, sex, address, branch);
            quanly.ThemCanBo(kysu);
        } else if (type == 2) {
            System.out.print("Nhập vào công việc của nhân viên");
            String work = sc.nextLine();
            CanBo nhanvien = new NhanVien(name, age, sex, address, work);
            quanly.ThemCanBo(nhanvien);
        } else {
            System.out.println("không thể thêm cán bộ");
        }
    }

    public void findbyName() {
        System.out.println("tìm kiếm thông tin cán bộ theo tên");
        System.out.print("nhập tên của cán bộ cần tìm kiếm");
        String nameFind = sc.nextLine();
        List<CanBo> canbo = quanly.TimKiemCanBo(nameFind);
        if (canbo == null) {
            System.out.println("không tìm thấy cán bộ theo yêu cầu");
        } else {
            for (CanBo canbo1 : canbo) {
               canbo1.showInfor();
            }
        }

    }
    public void allcanBo(){
        System.out.print("danh sách toàn bộ cán bộ là");
        List<CanBo> canbo= quanly.DanhSachCanBo();
        if (canbo == null) {
            System.out.println("Danh sách cán bộ rỗng");
        } else {
            for (CanBo canbo1 : canbo) {
           canbo1.showInfor();
            }
        }
    }
}
