package ontap.composite.bt2l3;

public abstract class Menu {
    String ten;
    double gia;

    public Menu(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public abstract void getTen();
    public abstract double getGia();
    public abstract void Add(Menu menu);
    public abstract void Remove(Menu menu);
}
