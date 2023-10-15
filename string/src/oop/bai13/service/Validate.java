package oop.bai13.service;


import oop.bai13.Exeption.BirthDayException;
import oop.bai13.Exeption.EmailException;
import oop.bai13.Exeption.FullNameException;
import oop.bai13.Exeption.PhoneException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Validate {
    public static boolean isValidBirthDay(String birthDay) throws BirthDayException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        try {
            Date date = dateFormat.parse(birthDay);
            return true;
        } catch (ParseException e) {
            throw new BirthDayException("Ngày sinh không hợp lệ.");
        }
    }

    public static boolean isValidEmail(String email) throws EmailException {
        String emailPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        if (!Pattern.matches(emailPattern, email)) {
            throw new EmailException("Địa chỉ email không hợp lệ.");
        }
        return true;
    }

    public static boolean isValidFullName(String fullName) throws FullNameException {
        if (fullName.isEmpty() || fullName.split("\\s+").length < 2) {
            throw new FullNameException("Tên không hợp lệ.");
        }
        return true;
    }

    public static boolean isValidPhone(String phone) throws PhoneException {
        if (!Pattern.matches("^\\d{10,}$", phone)) {
            throw new PhoneException("Số điện thoại không hợp lệ.");
        }
        return true;
    }
}
