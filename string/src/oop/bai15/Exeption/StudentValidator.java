package oop.bai15.Exeption;

import oop.bai15.object.Student;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class StudentValidator {

    public static boolean isUniqueStudentID(List<Student> students, int studentID) {

        return students.stream().noneMatch(student -> student.getStudentID() == studentID);
    }

    public static boolean isValidName(String name) {

        return name.split(" ").length >= 2;
    }

    public static boolean isValidDOB(String dob) {
        // Kiểm tra dob theo định dạng ngày tháng (VD: "yyyy-MM-dd")
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.setLenient(false);

        try {
            Date parsedDate = dateFormat.parse(dob);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
