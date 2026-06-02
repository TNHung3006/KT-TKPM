package behavioral.chain_of_responsibility.ot;

public class TinhTienBac1 extends TinhTienHandler{
    @Override
    public void tinhTien(double soKhoiConLai, HoaDon hoaDon) {
        if(soKhoiConLai > 0){
            double khoiTinhB1 = Math.min(soKhoiConLai, 10);
            double tien = khoiTinhB1 * 6000;

            hoaDon.congTien(tien);
            hoaDon.themChiTiet("Bac 1 (0 - 10m3: " + khoiTinhB1 + "m3x6000 = " + tien + "VND");
            double khoidu = soKhoiConLai - khoiTinhB1;
            if(khoidu > 0 && capTiepTheo != null){
                capTiepTheo.tinhTien(khoidu, hoaDon);
            }
        }
    }
}
