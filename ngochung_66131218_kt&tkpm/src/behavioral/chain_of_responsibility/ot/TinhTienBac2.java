package behavioral.chain_of_responsibility.ot;

public class TinhTienBac2 extends TinhTienHandler{
    @Override
    public void tinhTien(double soKhoiConLai, HoaDon hoaDon) {
        if(soKhoiConLai > 0){
            double khoiTinhB2 = Math.min(soKhoiConLai, 10);
            double tien = khoiTinhB2 * 7500;

            hoaDon.congTien(tien);
            hoaDon.themChiTiet("Bac 2 (10m3 - 20m3: " + khoiTinhB2 + "m3x7500 = " + tien + "VND");
            double khoidu = soKhoiConLai - khoiTinhB2;
            if(khoidu > 0 && capTiepTheo != null){
                capTiepTheo.tinhTien(khoidu, hoaDon);
            }
        }
    }
}
