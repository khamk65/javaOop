package oop.bai1.doituong;



public class CongNhan extends CanBo {
    private int leve;

    public int getLeve() {
        return leve;
    }

    public void setLeve(int leve) {
        this.leve = leve;
    }

    public CongNhan(String name, int age, String sex, String address, int leve) {
        super(name, age, sex, address);
        this.leve = leve;
    }

    @Override
    public void showInfor() {
        super.showInfor();
        System.out.print('/' + leve);
    }
}
