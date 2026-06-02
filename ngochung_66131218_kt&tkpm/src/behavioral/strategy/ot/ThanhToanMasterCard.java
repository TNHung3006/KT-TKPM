package behavioral.strategy.ot;

public class ThanhToanMasterCard implements IThanhToanStrategy{
    @Override
    public void thanhToan(double tongTienCanThanhToan) {
        double tienGiamThem = 0;
        if(tongTienCanThanhToan >= 3000000){
            double tinhTheopt = tongTienCanThanhToan * 0.05;
            tienGiamThem = Math.min(tinhTheopt, 300000);
        }
        double tienCuoiCung = tongTienCanThanhToan - tienGiamThem;
        System.out.println("[MasterCard] Giam: " + tienGiamThem + "VND");
        System.out.println(">> Khach thanh toan: " + tienCuoiCung + "VND");
    }
}
