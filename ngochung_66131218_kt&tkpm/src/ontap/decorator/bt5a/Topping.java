package ontap.decorator.bt5a;

public class Topping extends SanPhamDecorator{
     private String tentp;
     private double giatp;

    public Topping(SanPham sanPham, String tentp, double giatp) {
        super(sanPham);
        this.tentp = tentp;
        this.giatp = giatp;
    }

    @Override
    public double getGia() {
        return super.getGia() + giatp;
    }

    @Override
    public String getMota() {
        return super.getMota() + " | " + tentp;
    }
}
