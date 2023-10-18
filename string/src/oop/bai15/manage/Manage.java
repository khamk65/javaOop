package oop.bai15.manage;

import oop.bai15.object.*;

import java.util.*;
import java.util.stream.Collectors;

public class Manage {
    private List<School> ListSchool;

    public List<School> getListSchool() {
        return ListSchool;
    }

    public Manage() {
        this.ListSchool = new ArrayList<>();
    }

    public void addSchool(School sch) {
        this.ListSchool.add(sch);
    }

    public void addStudentToSchool(Student student, School school) {
        school.AddStudent(student);
    }

    // thêm viện vào list
    public void addDepartment(School department) {
        this.ListSchool.add(department);
    }

    //đếm số sinh viên chính quy
    public int countRegularStd(School department) {
        int count = 0;
        for (Student student : department.getSchool()) {
            if (student.isRegular()) {
                count++;
            }
        }
        return count;
    }

    // in ra thông tin của sinh viên thủ khoa đầu vào của viện
    public String nameStd(School sch) {
        Optional<Student> std = sch.getSchool().stream().max(Comparator.comparingDouble(Student::getPassingCore));
        return std.toString();
    }

    // danh sách các sinh viên tại chức với nơi liên kết của viện
    public List<ExternalStudent> listStdExternalPlace(String place, School sch) {
        List<ExternalStudent> stdExPlace = sch.getSchool().stream().filter(o -> (o instanceof ExternalStudent && ((ExternalStudent) o).getAffiliatedPlace().equals(place))).map(o -> (ExternalStudent) o).collect(Collectors.toList());
        return stdExPlace;
    }

    //danh sách sinh viên có điểm trung bình ở học kỳ gần nhất từ 8.0 trở lên
//    public List<Student> listStdGpaUp8() {
//        List<Student> stdGpaUp8 = ListSchool.stream().filter(o -> o.getSchool().stream().filter(student -> {
//            if (student.getGpaStudent().get(student.getGpaStudent().size()-1).getGpa()>8.0) {
//                return
//            }
//
//            return false;
//        }).collect(Collectors.toList()));
//        return stdGpaUp8;
//    }
    public List<Student> listStdGpaUp8(School sch) {
        List<Student> stdGpaUp8s = sch.getSchool().stream().filter(o -> o.getGpaStudent().get(o.getGpaStudent().size() - 1).getGpa() > 8.0).collect(Collectors.toList());
        return stdGpaUp8s;
    }

    // danh sách sinh viên ở mỗi khoa có điểm cao nhất trong 1 kỳ học
    public Map<String, Student> findMaxGpaStudentPerDepartment(School sch) {
        Map<String, Student> maxGpaStudentsPerDepartment = new HashMap<>();

        for (Student student : sch.getSchool()) {
            String department = sch.getName();
            double maxGpa = Double.NEGATIVE_INFINITY;

            for (Gpa gpa : student.getGpaStudent()) {
                if (gpa.getGpa() > maxGpa) {
                    maxGpa = gpa.getGpa();
                    maxGpaStudentsPerDepartment.put(department, student);
                }
            }
        }

        return maxGpaStudentsPerDepartment;
    }

    public void sortStudentsByTypeAndYear(School sch) {
        sch.getSchool().sort(
                Comparator.comparing(Student::isRegular) // Sắp xếp theo loại sinh viên (chính quy trước, tại chức sau)
                        .thenComparing(Student::getYearofaddun, Comparator.reverseOrder()) // Sắp xếp theo năm vào học giảm dần
        );
    }

    public Map<Integer, Long> countStudentsByAdmissionYear(School sch) {
        Map<Integer, Long> countByYear = sch.getSchool().stream()
                .collect(Collectors.groupingBy(Student::getYearofaddun, Collectors.counting()));
        return countByYear;
    }

    public List<Student> getAllStudents() {
        List<Student> allStudents = new ArrayList<>();
        for (School school : ListSchool) {
            allStudents.addAll(school.getSchool());
        }
        return allStudents;


    }
}