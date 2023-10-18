
package oop.bai15.object;

        import java.util.List;

public class RegularStudent extends Student {
    public RegularStudent(int studentID, String name, String dob, int yearofaddun, double passingCore, List<Gpa> gpaStudent) {
        super(studentID, name, dob, yearofaddun, passingCore, gpaStudent);
    }

    @Override
    public Boolean isRegular() {
        return true;
    }

}