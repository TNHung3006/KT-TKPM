package ontap.decorator.bt5;

public class SotDecorator extends SanPhamDecorator{
    private String tenSot;
    private double giaSot;

    public SotDecorator(SanPham sanPham, String tenSot, double giaSot) {
        super(sanPham);
        this.tenSot = tenSot;
        this.giaSot = giaSot;
    }

    @Override
    public double getGia() {
        return super.getGia() + giaSot;
    }

    @Override
    public String getMoTa() {
        return super.getMoTa() + " + " + tenSot;
    }
}
