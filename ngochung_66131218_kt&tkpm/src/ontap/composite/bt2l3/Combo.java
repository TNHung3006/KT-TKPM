package ontap.composite.bt2l3;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Menu{
    private List<Menu> children = new ArrayList<>();

    public Combo(String ten, double gia) {
        super(ten, gia);
    }

    @Override
    public void getTen() {
        System.out.println("Ten Com Bo: " + ten);
        for(Menu child : children){
            child.getTen();
        }
        System.out.println("Tong gia ComBo " + ten + " | Gia: " + getGia() );
    }

    @Override
    public double getGia() {
        int sum = 0;
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
