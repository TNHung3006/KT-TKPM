package ontap.decorator.bt5;

public class BasicSanPham implements SanPham{
    private String ten, moTa;
    private double gia;

    public BasicSanPham(String ten, String moTa, double gia) {
        this.ten = ten;
        this.moTa = moTa;
        this.gia = gia;
    }

    @Override
    public double getGia() {
        return gia;
    }

    @Override
    public String getMoTa() {
        return ten + " (" + moTa + ")";
    }
}
