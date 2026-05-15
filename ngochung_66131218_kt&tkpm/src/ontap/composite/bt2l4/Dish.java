package ontap.composite.bt2l4;

public class Dish extends Menu{
    public Dish(String ten, String moTa, double gia) {
        super(ten, moTa, gia);
    }

    @Override
    public void getMota() {
        System.out.println("Ten Mon An: " + ten + " | Gia: " + gia + " | Mo ta: " + moTa );
    }

    @Override
    public double getGia() {
        return gia;
    }

    @Override
    public void Add(Menu n) {

    }

    @Override
    public void Remove(Menu n) {

    }
}
