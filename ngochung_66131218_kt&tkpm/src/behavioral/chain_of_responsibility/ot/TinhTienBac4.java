package behavioral.chain_of_responsibility.ot;

public class TinhTienBac4 extends TinhTienHandler{
    @Override
    public void tinhTien(double soKhoiConLai, HoaDon hoaDon) {
        if(soKhoiConLai > 0){
            double tien = soKhoiConLai * 12000;

            hoaDon.congTien(tien);
            hoaDon.themChiTiet("Bac 4 (> 30m3: " + soKhoiConLai + "m3x12000 = " + tien + "VND");
        }
    }
}
