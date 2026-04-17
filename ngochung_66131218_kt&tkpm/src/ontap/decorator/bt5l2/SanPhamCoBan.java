package ontap.decorator.bt5l2;

public class SanPhamCoBan implements SanPham{
    String ten, moTa;
    double gia;

    public SanPhamCoBan(String ten, String moTa, double gia) {
        this.ten = ten;
        this.moTa = moTa;
        this.gia = gia;
    }

    @Override
    public String getTen() {
        return "Ten san pham: " + ten + " | Mo ta: " + moTa;
    }

    @Override
    public double getGia() {
        return gia;
    }
}
