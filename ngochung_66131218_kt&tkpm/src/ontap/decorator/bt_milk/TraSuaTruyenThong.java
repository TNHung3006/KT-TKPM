package ontap.decorator.bt_milk;

public class TraSuaTruyenThong implements TraSua{
    private double gia;

    public TraSuaTruyenThong(double gia) {
        this.gia = gia;
    }

    @Override
    public double TinhTien() {
        return gia;
    }
}
