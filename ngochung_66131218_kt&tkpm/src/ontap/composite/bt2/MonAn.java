package ontap.composite.bt2;

public class MonAn extends Menu {
    public MonAn(String ten, double gia) {
        super(ten, gia);
    }

    @Override
    public void ShowInfo() {
        System.out.println("Ten mon an: " + ten + " | Gia: " + gia);
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
