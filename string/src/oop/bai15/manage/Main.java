package oop.bai15.manage;

import java.util.Scanner;

import static oop.bai15.manage.StudentManagementUI.*;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Chọn một trong các tùy chọn sau:");
            System.out.println("0. Tạo khoa mới");
            System.out.println("1. Thêm Sinh viên");
            System.out.println("2. Đếm số lượng Sinh viên Chính quy");
            System.out.println("3. Tìm khoa có Sinh viên ưu tú nhất");
            System.out.println("4. Liệt kê Sinh viên Tại chức theo nơi liên kết");
            System.out.println("5. Liệt kê Sinh viên có GPA từ 8.0 trở lên");
            System.out.println("6. Sắp xếp danh sách Sinh viên");
            System.out.println("7. Thống kê số lượng Sinh viên theo năm nhập học");
            System.out.println("8. Thoát");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    addSchool();
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    countRegularStudents();
                    break;
                case 3:
                    findTopStudents();
                    break;
                case 4:
                    listExternalStudents();
                    break;
                case 5:
                    listHighGpaStudents();
                    break;
                case 6:
                    sortStudentsByTypeAndYear();
                    break;
                case 7:
                    countStudentsByAdmissionYear();
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
