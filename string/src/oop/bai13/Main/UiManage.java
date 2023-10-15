package oop.bai13.Main;

import oop.bai13.Exeption.BirthDayException;
import oop.bai13.Exeption.EmailException;
import oop.bai13.Exeption.FullNameException;
import oop.bai13.Exeption.PhoneException;
import oop.bai13.object.*;
import oop.bai13.service.ManageEmployee;
import oop.bai13.service.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UiManage {
    private Validate validator;
    private ManageEmployee manager;
    private Scanner scanner;

    public UiManage() {
        this.validator = new Validate();
        this.manager = new ManageEmployee();
        this.scanner = new Scanner(System.in);
    }

    public void addEmployee() {
        System.out.println("----- Thêm nhân viên -----");
        System.out.println("Chọn loại nhân viên (0 - Expert, 1 - Fresher, 2 - Intern): ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập loại nhân viên

        // Nhập thông tin chung cho tất cả loại nhân viên
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();

        System.out.print("Nhập Họ và Tên: ");
        String fullName = scanner.nextLine();

        System.out.print("Nhập Ngày sinh (dd/MM/yyyy): ");
        String birthDay = scanner.nextLine();

        System.out.print("Nhập Số điện thoại: ");
        String phone = scanner.nextLine();

        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();

        try {

            if (!Validate.isValidBirthDay(birthDay) || !Validate.isValidEmail(email) ||
                    !Validate.isValidFullName(fullName) || !Validate.isValidPhone(phone)) {
                System.out.println("Thông tin không hợp lệ. Không thể thêm nhân viên.");
                return;
            }
        } catch (EmailException | FullNameException | PhoneException | BirthDayException e) {
            System.out.println(e.getMessage());
            return;
        }

        Employee employee = null;
        if (type == 0) {

            System.out.print("Nhập số lượng chứng chỉ: ");
            int numberOfCertificates = scanner.nextInt();
            scanner.nextLine();

            List<Certificate> certificates = new ArrayList<>();
            for (int i = 0; i < numberOfCertificates; i++) {
                System.out.print("Nhập tên chứng chỉ " + (i + 1) + ": ");
                String certificateName = scanner.nextLine();

                System.out.print("Nhập ID chứng chỉ " + (i + 1) + ": ");
                String certificateID = scanner.nextLine();

                System.out.print("Nhập xếp hạng chứng chỉ " + (i + 1) + ": ");
                String certificateRank = scanner.nextLine();

                System.out.print("Nhập ngày cấp chứng chỉ " + (i + 1) + ": ");
                String certificateDate = scanner.nextLine();

                Certificate certificate = new Certificate(certificateID, certificateName, certificateRank, certificateDate);
                certificates.add(certificate);
            }

            System.out.print("Nhập số năm kinh nghiệm: ");
            int expInYear = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập kỹ năng chuyên môn: ");
            String proSkill = scanner.nextLine();

            employee = new Expert(id, fullName, birthDay, phone, email, certificates, expInYear, proSkill);
        } else if (type == 1) {

            System.out.print("Nhập số lượng chứng chỉ: ");
            int numberOfCertificates = scanner.nextInt();
            scanner.nextLine();
            List<Certificate> certificates = new ArrayList<>();
            for (int i = 0; i < numberOfCertificates; i++) {
                System.out.print("Nhập tên chứng chỉ " + (i + 1) + ": ");
                String certificateName = scanner.nextLine();

                System.out.print("Nhập ID chứng chỉ " + (i + 1) + ": ");
                String certificateID = scanner.nextLine();

                System.out.print("Nhập xếp hạng chứng chỉ " + (i + 1) + ": ");
                String certificateRank = scanner.nextLine();

                System.out.print("Nhập ngày cấp chứng chỉ " + (i + 1) + ": ");
                String certificateDate = scanner.nextLine();

                Certificate certificate = new Certificate(certificateID, certificateName, certificateRank, certificateDate);
                certificates.add(certificate);
            }

            System.out.print("Nhập ngày tốt nghiệp: ");
            String graduationDate = scanner.nextLine();

            System.out.print("Nhập xếp hạng tốt nghiệp: ");
            String graduationRank = scanner.nextLine();

            System.out.print("Nhập trình độ học vấn: ");
            String education = scanner.nextLine();

            employee = new Fresher(id, fullName, birthDay, phone, email, certificates, graduationDate, graduationRank, education);
        } else if (type == 2) {

            System.out.print("Nhập số lượng chứng chỉ: ");
            int numberOfCertificates = scanner.nextInt();
            scanner.nextLine();

            List<Certificate> certificates = new ArrayList<>();
            for (int i = 0; i < numberOfCertificates; i++) {
                System.out.print("Nhập tên chứng chỉ " + (i + 1) + ": ");
                String certificateName = scanner.nextLine();

                System.out.print("Nhập ID chứng chỉ " + (i + 1) + ": ");
                String certificateID = scanner.nextLine();

                System.out.print("Nhập xếp hạng chứng chỉ " + (i + 1) + ": ");
                String certificateRank = scanner.nextLine();

                System.out.print("Nhập ngày cấp chứng chỉ " + (i + 1) + ": ");
                String certificateDate = scanner.nextLine();

                Certificate certificate = new Certificate(certificateID, certificateName, certificateRank, certificateDate);
                certificates.add(certificate);
            }

            System.out.print("Nhập chuyên ngành: ");
            String majors = scanner.nextLine();

            System.out.print("Nhập học kỳ: ");
            String semester = scanner.nextLine();

            System.out.print("Nhập tên trường: ");
            String universityName = scanner.nextLine();

            employee = new Intern(id, fullName, birthDay, phone, email, certificates, majors, semester, universityName);
        }

        if (employee != null) {
            manager.addEmployee(employee);
            System.out.println("Thêm nhân viên thành công.");
        } else {
            System.out.println("Không thể thêm nhân viên.");
        }
    }

    public void findEmployeeById() {
        System.out.println("----- Tìm kiếm nhân viên theo ID -----");
        System.out.print("Nhập ID của nhân viên cần tìm: ");
        String idToFind = scanner.nextLine();

        Employee employeeFound = manager.findById(idToFind);

        if (employeeFound != null) {
            System.out.println("Thông tin nhân viên có ID " + idToFind + ":");
            System.out.println(employeeFound.toString());
        } else {
            System.out.println("Không tìm thấy nhân viên có ID: " + idToFind);
        }
    }

    public void deleteEmployee() {
        System.out.println("----- Xóa nhân viên -----");
        System.out.print("Nhập ID của nhân viên cần xóa: ");
        String idToDelete = scanner.nextLine();

        Employee employeeToDelete = manager.findById(idToDelete);

        if (employeeToDelete != null) {
            manager.deleteEmployee(idToDelete);
            System.out.println("Xóa nhân viên thành công.");
        } else {
            System.out.println("Không tìm thấy nhân viên có ID: " + idToDelete);
        }
    }

    public void updateEmployee() {
        System.out.println("----- Cập nhật thông tin nhân viên -----");
        System.out.print("Nhập ID của nhân viên cần cập nhật: ");
        String idToUpdate = scanner.nextLine();

        Employee employeeToUpdate = manager.findById(idToUpdate);

        if (employeeToUpdate != null) {
            manager.update(idToUpdate);
            System.out.println("Cập nhật thông tin nhân viên thành công.");
        } else {
            System.out.println("Không tìm thấy nhân viên có ID: " + idToUpdate);
        }
    }

    public void displayAllEmployees() {
        System.out.println("----- Danh sách tất cả nhân viên -----");
        List<Employee> employees = manager.AllEmployee();
        if (employees.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
        }
    }

    public void displayEmployeesByType(int type) {
        System.out.println("----- Danh sách nhân viên theo loại -----");
        List<Employee> employees = manager.findByType(type);
        if (employees.isEmpty()) {
            System.out.println("Không có nhân viên thuộc loại này.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
        }
    }

}
