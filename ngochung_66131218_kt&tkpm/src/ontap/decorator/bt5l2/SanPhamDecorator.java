package ontap.decorator.bt5l2;

public class SanPhamDecorator implements SanPham{
    protected SanPham sanPham;

    public SanPhamDecorator(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    @Override
    public String getTen() {
        return sanPham.getTen();
    }

    @Override
    public double getGia() {
        return sanPham.getGia();
    }
}
