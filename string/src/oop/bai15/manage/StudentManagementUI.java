package oop.bai15.manage;

import oop.bai15.Exeption.ExeptionDob;
import oop.bai15.Exeption.ExeptionId;
import oop.bai15.Exeption.ExeptionName;
import oop.bai15.Exeption.StudentValidator;
import oop.bai15.object.ExternalStudent;
import oop.bai15.object.Gpa;
import oop.bai15.object.RegularStudent;
import oop.bai15.object.School;
import oop.bai15.object.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementUI {

    private static Manage manager = new Manage();

    public static void addSchool() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào tên của khoa");
        String name = scanner.nextLine();
        manager.addSchool(new School(name));

    }

    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập loại sinh viên (1 cho Sinh viên Chính quy, 2 cho Sinh viên Tại chức): ");
            int studentType = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nhập mã sinh viên: ");
            int studentID = scanner.nextInt();
            scanner.nextLine();

            if (!StudentValidator.isUniqueStudentID(manager.getAllStudents(), studentID)) {
                throw new ExeptionId("Mã sinh viên không duy nhất!");
            }

            System.out.print("Nhập tên sinh viên: ");
            String name = scanner.nextLine();
            if (!StudentValidator.isValidName(name)) {
                throw new ExeptionName("Định dạng tên không hợp lệ. Vui lòng nhập ít nhất họ và tên.");
            }

            System.out.print("Nhập ngày tháng năm sinh (yyyy/MM/dd): ");
            String dob = scanner.nextLine();
            if (!StudentValidator.isValidDOB(dob)) {
                throw new ExeptionDob("Định dạng ngày tháng năm sinh không hợp lệ. Vui lòng sử dụng yyyy/MM/dd.");
            }

            System.out.print("Nhập năm nhập học: ");
            int yearOfAdmission = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nhập điểm đầu vào: ");
            double passingCore = scanner.nextDouble();
            scanner.nextLine();

            List<Gpa> gpas = new ArrayList<>();
            System.out.print("Nhập số lượng kỳ học: ");
            int numGpas = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numGpas; i++) {
                System.out.print("Nhập kỳ hoc(ví dụ 20221)" + ": ");
                double gpaName = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Nhập điểm Gpa của kỳ " + ": ");
                double gpaValue = scanner.nextDouble();
                scanner.nextLine();

                gpas.add(new Gpa(gpaName, gpaValue));
            }

            if (studentType == 1) {
                RegularStudent student = new RegularStudent(studentID, name, dob, yearOfAdmission, passingCore, gpas);
                manager.addStudentToSchool(student, getSchoolFromUser());
            } else if (studentType == 2) {
                System.out.print("Nhập nơi liên kết cho Sinh viên Tại chức: ");
                String affiliatedPlace = scanner.nextLine();
                ExternalStudent student = new ExternalStudent(studentID, name, dob, yearOfAdmission, passingCore, gpas, affiliatedPlace);
                manager.addStudentToSchool(student, getSchoolFromUser());
            }

            System.out.println("Sinh viên đã được thêm thành công!");
        } catch (ExeptionId | ExeptionName | ExeptionDob e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void countRegularStudents() {
        int count = manager.countRegularStd(getSchoolFromUser());
        System.out.println("Số lượng Sinh viên Chính quy: " + count);
    }

    public static void findTopStudents() {
        Map<String, Student> topStudentsByDepartment = manager.findMaxGpaStudentPerDepartment(getSchoolFromUser());
        if (!topStudentsByDepartment.isEmpty()) {
            System.out.println("Sinh viên điểm cao nhất ở từng khoa:");
            for (Map.Entry<String, Student> entry : topStudentsByDepartment.entrySet()) {
                System.out.println("Khoa: " + entry.getKey() + ", Sinh viên điểm cao: " + entry.getValue().getName());
            }
        } else {
            System.out.println("Không tìm thấy sinh viên ở bất kỳ khoa nào.");
        }
    }


    public static void listExternalStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nơi liên kết để liệt kê Sinh viên Tại chức: ");
        String place = scanner.nextLine();
        School department = getSchoolFromUser();

        List<ExternalStudent> externalStudents = manager.listStdExternalPlace(place, department);

        if (externalStudents.isEmpty()) {
            System.out.println("Không tìm thấy Sinh viên Tại chức tại nơi liên kết này.");
        } else {
            System.out.println("Danh sách Sinh viên Tại chức tại nơi liên kết '" + place + "':");
            for (ExternalStudent student : externalStudents) {
                System.out.println("Mã sinh viên: " + student.getStudentID() + ", Tên: " + student.getName());
            }
        }
    }

    public static void listHighGpaStudents() {
        School department = getSchoolFromUser();
        List<Student> highGpaStudents = manager.listStdGpaUp8(department);

        if (highGpaStudents.isEmpty()) {
            System.out.println("Không tìm thấy Sinh viên có GPA từ 8.0 trở lên.");
        } else {
            System.out.println("Danh sách Sinh viên có GPA từ 8.0 trở lên:");
            for (Student student : highGpaStudents) {
                System.out.println("Mã sinh viên: " + student.getStudentID() + ", Tên: " + student.getName());
            }
        }
    }

    private static School getSchoolFromUser() {
        if (manager.getListSchool().isEmpty()) {
            System.out.println("Chưa có khoa nào được tạo. Vui lòng tạo khoa trước.");
            return null;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Chọn khoa (Nhập số thứ tự của khoa, bắt đầu từ 1): ");
        int departmentIndex = scanner.nextInt();
        scanner.nextLine();

        if (departmentIndex < 1 || departmentIndex > manager.getListSchool().size()) {
            System.out.println("Số thứ tự khoa không hợp lệ.");
            return null;
        }

        return manager.getListSchool().get(departmentIndex - 1);
    }

    public static void sortStudentsByTypeAndYear() {
        School department = getSchoolFromUser();
        if (department != null) {
            manager.sortStudentsByTypeAndYear(department);
            System.out.println("Danh sách Sinh viên của khoa " + department.getName() + " đã được sắp xếp.");
        }
    }

    public static void countStudentsByAdmissionYear() {
        School department = getSchoolFromUser();
        if (department != null) {
            Map<Integer, Long> countByYear = manager.countStudentsByAdmissionYear(department);
            System.out.println("Thống kê số lượng Sinh viên theo năm nhập học tại khoa " + department.getName() + ":");
            for (Map.Entry<Integer, Long> entry : countByYear.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}