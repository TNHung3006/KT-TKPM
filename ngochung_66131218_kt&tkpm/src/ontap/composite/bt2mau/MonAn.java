package ontap.composite.bt2mau;

public class MonAn extends Menu{
    public MonAn(String ten, double gia) {
        super(ten, gia);
    }

    @Override
    public void ShowTen() {
        System.out.println(ten + " | gia: " + getGia());
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
