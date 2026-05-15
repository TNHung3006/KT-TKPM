package ontap.decorator.bt5a;

public class SanPhamDecorator implements SanPham{
    protected SanPham sanPham;

    public SanPhamDecorator(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    @Override
    public double getGia() {
        return sanPham.getGia();
    }

    @Override
    public String getMota() {
        return sanPham.getMota();
    }
}
