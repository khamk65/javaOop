package oop.bai13.service;

import oop.bai13.object.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManageEmployee {

    Scanner scanner = new Scanner(System.in);
    private List<Employee> employeers;

    public ManageEmployee() {
        this.employeers = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employeers.add(employee);
    }

    public Employee findById(String id) {
        return this.employeers.stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
    }

    public void deleteEmployee(String id) {
        Employee employ = this.findById(id);
        if (employ == null) {
            System.out.println("Đối tượng không tồn tại");
        } else {
            this.employeers.remove(employ);

        }
    }

    public List<Employee> findByType(int type) {
        return this.employeers.stream()
                .filter(employee -> {
                    if (type == 0) {
                        return employee instanceof Expert;
                    }
                    if (type == 1) {
                        return employee instanceof Fresher;
                    }
                    if (type == 2) {
                        return employee instanceof Intern;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public void update(String id) {
        Employee employee = findById(id);
        if (employee != null) {
            if (employee instanceof Expert) {
                Expert expert = (Expert) employee;

                System.out.print("Nhập ID: ");
                String Id = scanner.nextLine();
                expert.setId(Id);

                System.out.print("Nhập Họ và Tên: ");
                String fullName = scanner.nextLine();
                expert.setFullName(fullName);

                System.out.print("Nhập Ngày sinh: ");
                String birthDay = scanner.nextLine();
                expert.setBirthDay(birthDay);

                System.out.print("Nhập Số điện thoại: ");
                String phone = scanner.nextLine();
                expert.setPhone(phone);

                System.out.print("Nhập Email: ");
                String email = scanner.nextLine();
                expert.setEmail(email);

                List<Certificate> certificates = new ArrayList<>();
                expert.setCertifi(certificates);

                System.out.print("Nhập số lượng chứng chỉ: ");
                int numberOfCertificates = Integer.parseInt(scanner.nextLine());

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
                int expInYear = Integer.parseInt(scanner.nextLine());
                expert.setExpInYear(expInYear);

                System.out.print("Nhập kỹ năng chuyên môn: ");
                String proSkill = scanner.nextLine();
                expert.setProSkill(proSkill);
            } else if (employee instanceof Fresher) {
                if (employee instanceof Fresher) {
                    Fresher fresher = (Fresher) employee;

                    System.out.print("Nhập ID: ");
                    String Id = scanner.nextLine();
                    fresher.setId(Id);

                    System.out.print("Nhập Họ và Tên: ");
                    String fullName = scanner.nextLine();
                    fresher.setFullName(fullName);

                    System.out.print("Nhập Ngày sinh: ");
                    String birthDay = scanner.nextLine();
                    fresher.setBirthDay(birthDay);

                    System.out.print("Nhập Số điện thoại: ");
                    String phone = scanner.nextLine();
                    fresher.setPhone(phone);

                    System.out.print("Nhập Email: ");
                    String email = scanner.nextLine();
                    fresher.setEmail(email);

                    List<Certificate> certificates = new ArrayList<>();
                    fresher.setCertifi(certificates);

                    System.out.print("Nhập số lượng chứng chỉ: ");
                    int numberOfCertificates = Integer.parseInt(scanner.nextLine());

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
                    fresher.setGraduation_date(graduationDate);

                    System.out.print("Nhập xếp hạng tốt nghiệp: ");
                    String graduationRank = scanner.nextLine();
                    fresher.setGraduation_rank(graduationRank);

                    System.out.print("Nhập trình độ học vấn: ");
                    String education = scanner.nextLine();
                    fresher.setEducation(education);
                }

            } else if (employee instanceof Intern) {

                Intern intern = (Intern) employee;

                System.out.print("Nhập ID: ");
                String Id = scanner.nextLine();
                intern.setId(Id);

                System.out.print("Nhập Họ và Tên: ");
                String fullName = scanner.nextLine();
                intern.setFullName(fullName);

                System.out.print("Nhập Ngày sinh: ");
                String birthDay = scanner.nextLine();
                intern.setBirthDay(birthDay);

                System.out.print("Nhập Số điện thoại: ");
                String phone = scanner.nextLine();
                intern.setPhone(phone);

                System.out.print("Nhập Email: ");
                String email = scanner.nextLine();
                intern.setEmail(email);

                List<Certificate> certificates = new ArrayList<>();
                intern.setCertifi(certificates);

                System.out.print("Nhập số lượng chứng chỉ: ");
                int numberOfCertificates = Integer.parseInt(scanner.nextLine());

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
                intern.setMajors(majors);

                System.out.print("Nhập học kỳ: ");
                String semester = scanner.nextLine();
                intern.setSemester(semester);

                System.out.print("Nhập tên trường: ");
                String universityName = scanner.nextLine();
                intern.setUniversity_name(universityName);


            }
            System.out.println("Cập nhật thông tin thành công.");
        } else {
            System.out.println("Không tìm thấy nhân viên");
        }
    }


    public List<Employee> AllEmployee() {
        return this.employeers;
    }

}
