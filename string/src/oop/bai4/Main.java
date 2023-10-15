package oop.bai4;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KhuPho pho=new KhuPho();
        Scanner sc=new Scanner(System.in);
        System.out.print("nhập vào số lượng hộ gia đình của khu phố");
        List<HoGiaDinh> ho=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){

            System.out.println("hộ gia đình thứ"+(i+1));
            List<Nguoi> nguoi=new ArrayList<>();
            System.out.println("nhập vào số lượng thành viên trong gia đình");
            int m=sc.nextInt();
            for(int j=0;j<m;j++){
                System.out.println("người thứ "+(i+1));
                System.out.print("tên");
                String name=sc.nextLine();
                sc.nextLine();
                System.out.print("tuổi");
                int age=sc.nextInt();
                System.out.print("nghề");
                String profession=sc.nextLine();
                sc.nextLine();
                System.out.print("căn cước công dân");
                String cccd=sc.nextLine();
                Nguoi nguoimoi=new Nguoi(name,age,profession,cccd);
                nguoi.add(nguoimoi);
            }
String address=sc.nextLine();
HoGiaDinh honew=new HoGiaDinh(nguoi,address);
ho.add(honew);
        }
  pho.setHo(ho);
        System.out.println("xuất ra thông tin của các hộ gia đình");
        ho.forEach(o-> System.out.println(o.toString()));
    }

}
