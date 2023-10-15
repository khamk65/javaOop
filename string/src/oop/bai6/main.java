package oop.bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Lop lop=new Lop();

        System.out.println("số lượng học sinh có trong lớp");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("học sinh thứ"+(i+1));
            System.out.print("ten");
            String name=sc.nextLine();
            System.out.println("tuoi");
            int age=sc.nextInt();
            System.out.println("dia chi");
            String address=sc.nextLine();
            HocSinh hs=new HocSinh(name,age,address);
lop.setHs(hs);
        }
        lop.get23YearDN();
        lop.getHs20year();
    }
}
