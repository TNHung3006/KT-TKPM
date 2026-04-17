package ontap.decorator.bt5l2;

import ontap.decorator.bt5l2.SanPham;
import ontap.decorator.bt5l2.SanPhamDecorator;

public class DongGoi extends SanPhamDecorator {

    public DongGoi(SanPham sanPham) {
        super(sanPham);
    }

    @Override
    public double getGia() {
        return super.getGia() + 5000;
    }

    @Override
    public String getTen() {
        return super.getTen() + "Da dong goi dat biet";
    }
}
