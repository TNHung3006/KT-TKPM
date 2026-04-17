package ontap.decorator.bt5l2;

import ontap.decorator.bt5l2.SanPham;
import ontap.decorator.bt5l2.SanPhamDecorator;

public class ThemTopping extends SanPhamDecorator {
    String tenTopping;
    double giaTopping;

    public ThemTopping(SanPham sanPham, double giaTopping, String tenTopping) {
        super(sanPham);
        this.giaTopping = giaTopping;
        this.tenTopping = tenTopping;
    }

    @Override
    public double getGia() {
        return super.getGia() + giaTopping;
    }

    @Override
    public String getTen() {
        return super.getTen() + " + " + tenTopping;
    }
}
