package ontap.composite.bt2;

public abstract class Menu {
    String ten;
    double gia;

    public Menu(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public abstract void ShowInfo();
    public abstract double getGia();
    public abstract void Add(Menu n);
    public abstract void Remove(Menu n);
}
