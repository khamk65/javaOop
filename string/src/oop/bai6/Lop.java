package oop.bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lop {
 private    List<HocSinh> hs;

    public Lop() {
        this.hs = new ArrayList<>();
    }

    public List<HocSinh> getHs20year() {
return this.hs.stream().filter(o->o.getAge()==20).collect(Collectors.toList());
    }

    public void setHs(HocSinh hs) {
        this.hs.add(hs);
    }
public long get23YearDN(){
        return this.hs.stream().filter(o->o.getAge()==23&&o.getAddress().equals("DN")).count();
}

}
