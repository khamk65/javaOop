package oop.bai4;

import java.util.List;

public class HoGiaDinh {
 private   List<Nguoi> nguoi;

    private String address;

    public HoGiaDinh(List<Nguoi> nguoi, String address) {
        this.nguoi = nguoi;

        this.address = address;
    }

    public List<Nguoi> getNguoi() {
        return nguoi;
    }

    public void setNguoi(List<Nguoi> nguoi) {
        this.nguoi = nguoi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Địa chỉ: ").append(address).append("\n");

        sb.append("Danh sách thành viên gia đình:\n");
        for (Nguoi nguoi : nguoi) {
            sb.append(nguoi.toString()).append("\n");
        }

        return sb.toString();
    }

}
