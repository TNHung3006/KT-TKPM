package ontap.decorator.bt5;

public class DonggoiDecorator extends SanPhamDecorator{
    public DonggoiDecorator(SanPham sanPham) {
        super(sanPham);
    }

    @Override
    public double getGia() {
        return super.getGia() + 5000;
    }

    @Override
    public String getMoTa() {
        return super.getMoTa() + "[Dong goi dat biet]";
    }
}
