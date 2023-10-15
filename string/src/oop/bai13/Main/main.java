package oop.bai13.Main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        UiManage ui = new UiManage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- Quản lý nhân viên -----");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Cập nhật thông tin nhân viên");
            System.out.println("4. Hiển thị tất cả nhân viên");
            System.out.println("5. Hiển thị nhân viên theo loại");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    ui.addEmployee();
                    break;
                case 2:
                    ui.deleteEmployee();
                    break;
                case 3:
                    ui.updateEmployee();
                    break;
                case 4:
                    ui.displayAllEmployees();
                    break;
                case 5:
                    System.out.println("Chọn loại nhân viên ");
                    int type = scanner.nextInt();
                    ui.displayEmployeesByType(type);
                    break;
                case 6:
                    System.out.println("Chương trình kết thúc.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}

