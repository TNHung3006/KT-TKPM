package behavioral.strategy.ot;

public class KhuyenMaiCoDinh implements IKhuyenMaiStrategy{
    private double soTienGiam;

    public KhuyenMaiCoDinh(double soTienGiam) {
        this.soTienGiam = soTienGiam;
    }

    @Override
    public double tinhTienGiam(double tongtien) {
        return Math.min(soTienGiam, tongtien);
    }
}
