package ontap.decorator.bt5a;

public class Sot extends SanPhamDecorator{
    private String tensot;
    private double giasot;

    public Sot(SanPham sanPham, String tensot, double giasot) {
        super(sanPham);
        this.tensot = tensot;
        this.giasot = giasot;
    }

    @Override
    public double getGia() {
        return super.getGia() + giasot;
    }

    @Override
    public String getMota() {
        return super.getMota() + " | " + tensot;
    }
}
