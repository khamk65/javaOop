package oop.bai1.doituong;

public class KySu extends CanBo{
    private String branch;

    public String getBranch() {
        return branch;
    }

    public KySu(String name, int age, String sex, String address, String branch) {
        super(name, age, sex, address);
        this.branch = branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public void showInfor() {
        super.showInfor();
        System.out.println('/' + branch);
    }
}

