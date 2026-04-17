package ontap.decorator.bt5;

public class ToppingDecorator extends SanPhamDecorator{
    private String tenTopping;
    private double giaTopping;

    public ToppingDecorator(SanPham sanPham, String tenTopping, double giaTopping) {
        super(sanPham);
        this.tenTopping = tenTopping;
        this.giaTopping = giaTopping;
    }

    @Override
    public double getGia() {
        return super.getGia() + giaTopping;
    }

    @Override
    public String getMoTa() {
        return super.getMoTa() + " + " + tenTopping;
    }
}
