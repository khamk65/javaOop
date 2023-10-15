package oop.bai1.quanly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ui ui = new Ui();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Chương trình quản lý cán bộ ");
            System.out.println("Nhập vào giá trị tương ứng để chạy chương trình");
            System.out.println("1-thêm cán bộ");
            System.out.println("2-tìm kiếm cán bộ theo tên");
            System.out.println("3-Hiển thị toàn bộ danh sách cán bộ");
            System.out.println("4-thoát chương trình");

            System.out.print("nhập vào lựa chọn của bạn");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1: ui.ThemCanBo();
                break;
                case 2:ui.findbyName();
                break;
                case 3:ui.allcanBo();
                break;
                case 4: return;
                default:
                    System.out.println("không tìm thấy yêu cầu của bạn");
                    break;
            }
        }
    }
}