package behavioral.strategy.ot;

public class KhuyenMaiPhanTram implements IKhuyenMaiStrategy{
    private double phanTramGiam;
    private double giamToiDa;

    public KhuyenMaiPhanTram(double phanTramGiam, double giamToiDa) {
        this.phanTramGiam = phanTramGiam;
        this.giamToiDa = giamToiDa;
    }

    @Override
    public double tinhTienGiam(double tongtien) {
        double tienGiamTheoPt= tongtien*(phanTramGiam/100);
        return Math.min(tienGiamTheoPt, giamToiDa);
    }
}
