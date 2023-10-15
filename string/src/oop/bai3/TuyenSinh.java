package oop.bai3;

import oop.bai1.*;

import java.util.List;
import java.util.Scanner;

public class TuyenSinh {
    public static void main(String[] args) {
        DanhSachThiSinh thisinh = new DanhSachThiSinh();
        System.out.println("nhập vào ký tự để thực hiện yêu cầu:");
        System.out.println("nhập a để thêm mới thí sinh");
        System.out.println("nhập b để tìm thí sinh");
        System.out.println("nhập c để hiển thị toàn bộ danh sách thí sinh");
        System.out.println("nhập d để thoát khỏi chương trình");
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        switch (ch) {
            case "a":

                System.out.println("nhập vào 1 để chọn thí sinh khối A");
                System.out.println("nhập vào 2 để chọn thí sinh khối B");
                System.out.println("nhập vào 3 để chọn thí sinh khối C");

                int ch1 = sc.nextInt();

                switch (ch1) {
                    case 1 :
                        sc.nextLine();
                        System.out.print("tên ");
                        String nameA = sc.nextLine();
                        System.out.print("số báo danh");
                        String sbdA = sc.nextLine();
                        sc.nextLine();
                        System.out.print("địa chỉ");

                        String addressA = sc.nextLine();
                        System.out.print("mức độ ưu tiên ");
                       String buffA = sc.nextLine();
                        ThiSinh khoiA = new KhoiA(sbdA,nameA,addressA,buffA);
                        thisinh.ThemThisinh(khoiA);
                        System.out.println("thêm thí sinh" + khoiA.toString() + "thanhcong");
                        break;
                    case 2 :
                        sc.nextLine();
                        System.out.print("tên ");
                        String nameB = sc.nextLine();
                        System.out.print("số báo danh");
                        String sbdB = sc.nextLine();
                        sc.nextLine();
                        System.out.print("địa chỉ");

                        String addressB = sc.nextLine();
                        System.out.print("mức độ ưu tiên ");
                        String buffB = sc.nextLine();
                        ThiSinh khoiB = new KhoiB(sbdB,nameB,addressB,buffB);
                        thisinh.ThemThisinh(khoiB);
                        System.out.println("thêm thí sinh" + khoiB.toString() + "thanhcong");
                        break;
                    case 3 :
                        sc.nextLine();
                        System.out.print("tên ");
                        String nameC = sc.nextLine();
                        System.out.print("số báo danh");
                        String sbdC = sc.nextLine();
                        sc.nextLine();
                        System.out.print("địa chỉ");

                        String addressC = sc.nextLine();
                        System.out.print("mức độ ưu tiên ");
                        String buffC = sc.nextLine();
                        ThiSinh khoiC = new KhoiA(sbdC,nameC,addressC,buffC);
                        thisinh.ThemThisinh(khoiC);
                        System.out.println("thêm thí sinh" + khoiC.toString() + "thanhcong");
                        break;
                    default:
                        System.out.println("ko tìm thấy");
                        break;
                }

                break;

            case "b":
                System.out.print("Nhập vào số báo danh thí sinh cần tìm: ");
                String sbdFind = sc.nextLine();
                List<ThiSinh> ketQuaTimKiem = thisinh.TimKiemThiSinh(sbdFind);
                if (ketQuaTimKiem.isEmpty()) {
                    System.out.println("Không tìm thấy cán bộ nào có tên: " + sbdFind);
                } else {
                    System.out.println("Kết quả tìm kiếm:");
                    for (ThiSinh cb : ketQuaTimKiem) {
                        System.out.println(cb.toString());
                    }
                }

                break;
            case "c":
                sc.nextLine();
                System.out.print("danh sách cán bộ");
                thisinh.DanhSachThiSinh();
                break;
            case "d":
                System.out.print("thoát chương trình");
                return;
            default:
                System.out.print("không tìm thấy yêu cầu");

        }
    }
}