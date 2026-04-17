package ontap.composite.bt2l3;

public class Dish extends Menu{
    public Dish(String ten, double gia) {
        super(ten, gia);
    }

    @Override
    public void getTen() {
        System.out.println("Ten mon: " + ten + " | Gia: " + getGia());
    }

    @Override
    public double getGia() {
        return gia;
    }

    @Override
    public void Add(Menu menu) {

    }

    @Override
    public void Remove(Menu menu) {

    }
}
