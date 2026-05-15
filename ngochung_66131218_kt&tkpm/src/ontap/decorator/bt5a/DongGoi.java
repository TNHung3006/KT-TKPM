package ontap.decorator.bt5a;

public class DongGoi extends SanPhamDecorator{
    public DongGoi(SanPham sanPham) {
        super(sanPham);
    }

    @Override
    public double getGia() {
        return super.getGia() + 5000;
    }

    @Override
    public String getMota() {
        return super.getMota() + "Dong goi dat biet";
    }
}
