package ontap.decorator.bt5;

public class MagiamgiaDecorator extends SanPhamDecorator{
    private double phanTram;

    public MagiamgiaDecorator(SanPham sanPham, double phanTram) {
        super(sanPham);
        this.phanTram = phanTram;
    }

    @Override
    public double getGia() {
        return super.getGia() * (1 - phanTram/100);
    }

    @Override
    public String getMoTa() {
        return super.getMoTa() + " (Giam gia " + phanTram + "%)";
    }
}
