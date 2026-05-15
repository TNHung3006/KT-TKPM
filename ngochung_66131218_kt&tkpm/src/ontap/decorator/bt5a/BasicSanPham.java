package ontap.decorator.bt5a;

public class BasicSanPham implements SanPham{
    private String tensp, mota;
    private double gia;

    public BasicSanPham(String tensp, String mota, double gia) {
        this.tensp = tensp;
        this.mota = mota;
        this.gia = gia;
    }


    @Override
    public double getGia() {
        return gia;
    }

    @Override
    public String getMota() {
        return tensp + " | " + gia + " | " + mota;
    }
}
