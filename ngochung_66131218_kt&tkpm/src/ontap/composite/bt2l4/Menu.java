package ontap.composite.bt2l4;

public abstract class Menu {
    String ten, moTa;
    double gia;

    public Menu(String ten, String moTa, double gia) {
        this.ten = ten;
        this.moTa = moTa;
        this.gia = gia;
    }

    public abstract void getMota();
    public abstract double getGia();
    public abstract void Add(Menu n);
    public abstract void Remove(Menu n);

}
