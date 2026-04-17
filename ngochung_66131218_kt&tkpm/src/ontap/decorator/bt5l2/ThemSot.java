package ontap.decorator.bt5l2;

import ontap.decorator.bt5l2.SanPham;
import ontap.decorator.bt5l2.SanPhamDecorator;

public class ThemSot extends SanPhamDecorator {
    String tenSot;
    double giaSot;

    public ThemSot(SanPham sanPham, String tenSot, double giaSot) {
        super(sanPham);
        this.tenSot = tenSot;
        this.giaSot = giaSot;
    }

    @Override
    public double getGia() {
        return super.getGia() + giaSot;
    }

    @Override
    public String getTen() {
        return super.getTen() + tenSot;
    }
}
