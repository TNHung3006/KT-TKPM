package behavioral.chain_of_responsibility.ot;

public class TinhTienBac3 extends TinhTienHandler{
    @Override
    public void tinhTien(double soKhoiConLai, HoaDon hoaDon) {
        if(soKhoiConLai > 0){
            double khoiTinhB3 = Math.min(soKhoiConLai, 10);
            double tien = khoiTinhB3 * 9000;

            hoaDon.congTien(tien);
            hoaDon.themChiTiet("Bac 3 (20m3 - 30m3: " + khoiTinhB3 + "m3x9000 = " + tien + "VND");
            double khoidu = soKhoiConLai - khoiTinhB3;
            if(khoidu > 0 && capTiepTheo != null){
                capTiepTheo.tinhTien(khoidu, hoaDon);
            }
        }
    }
}
