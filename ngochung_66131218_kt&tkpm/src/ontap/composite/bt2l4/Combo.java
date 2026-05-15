package ontap.composite.bt2l4;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Menu{
    private List<Menu> children = new ArrayList<>();

    public Combo(String ten, String moTa, double gia) {
        super(ten, moTa, gia);
    }

    @Override
    public void getMota() {
        System.out.println("Ten ComBo: " + ten);
        for(Menu child : children){
            child.getMota();
        }
        System.out.println("Tong gia cua ComBo " + ten + " la: " + getGia());
    }

    @Override
    public double getGia() {
        float sum = 0;
        for(Menu child : children){
            sum += child.getGia();
        }
        return sum;
    }

    @Override
    public void Add(Menu n) {
        children.add(n);
    }

    @Override
    public void Remove(Menu n) {
        children.remove(n);
    }
}
