package ontap.decorator.bt5;

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
    public String getMoTa() {
        return sanPham.getMoTa();
    }
}
