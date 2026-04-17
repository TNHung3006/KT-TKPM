package ontap.decorator.bt5l2;

import ontap.decorator.bt5l2.SanPham;
import ontap.decorator.bt5l2.SanPhamDecorator;

public class MaGiamGia extends SanPhamDecorator {
    double maGiamGia;

    public MaGiamGia(SanPham sanPham, int maGiamGia) {
        super(sanPham);
        this.maGiamGia = maGiamGia;
    }

    @Override
    public double getGia() {
        return super.getGia() * (1 - maGiamGia/100);
    }

    @Override
    public String getTen() {
        return super.getTen() + " Ma giam gia dac biet";
    }
}
