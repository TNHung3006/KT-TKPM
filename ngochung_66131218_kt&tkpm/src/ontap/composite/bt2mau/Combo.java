package ontap.composite.bt2mau;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Menu{
    private List<Menu> children = new ArrayList<>();
    public Combo(String ten) {
        super(ten, 0);
    }

    @Override
    public void ShowTen() {
        System.out.println("Combo " + ten);
        for(Menu child : children){
            child.ShowTen();
        }
        System.out.println("Tong gia Combo " + ten + " la: " + getGia());
    }

    @Override
    public double getGia() {
        double sum = 0;
        for(Menu child : children){
            sum += child.getGia();
        }
        return sum;
    }

    @Override
    public void Add(Menu menu) {
        children.add(menu);
    }

    @Override
    public void Remove(Menu menu) {
        children.remove(menu);
    }
}
