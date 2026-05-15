package behavioral.strategy.CC3;

public class KhuyenMaiPhanTramGiamToiDa implements IKhuyenMai{
    private double phanTramGiam;
    private double mucGiamToiDa;

    public KhuyenMaiPhanTramGiamToiDa(double phanTramGiam, double mucGiamToiDa) {
        this.phanTramGiam = phanTramGiam;
        this.mucGiamToiDa = mucGiamToiDa;
    }

    @Override
    public double tinhTienKhuyenMai(double tongTienHang) {
        double tienGiamTheoPhanTram = tongTienHang*phanTramGiam;
        return Math.min(tienGiamTheoPhanTram, mucGiamToiDa);
    }
}
