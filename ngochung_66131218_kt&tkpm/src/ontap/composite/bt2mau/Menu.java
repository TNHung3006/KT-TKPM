package ontap.composite.bt2mau;

public abstract class Menu {
    String ten;
    double gia;

    public Menu(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public abstract void ShowTen();
    public abstract double getGia();
    public abstract void Add(Menu menu);
    public abstract void Remove(Menu menu);

}
