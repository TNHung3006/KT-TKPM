package ontap.decorator.bt5a;

public class Magiamgia extends SanPhamDecorator{
    private double phantram;

    public Magiamgia(SanPham sanPham, double phantram) {
        super(sanPham);
        this.phantram = phantram;
    }

    @Override
    public double getGia() {
        return super.getGia() * (1 - phantram/100);
    }

    @Override
    public String getMota() {
        return super.getMota() + " | " + phantram + "%";
    }
}
