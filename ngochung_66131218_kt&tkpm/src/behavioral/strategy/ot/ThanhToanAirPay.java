package behavioral.strategy.ot;

public class ThanhToanAirPay implements IThanhToanStrategy{
    @Override
    public void thanhToan(double tongTienCanThanhToan) {
        double tienGiamThem = 0;
        if(tongTienCanThanhToan >= 1000000){
            tienGiamThem = tongTienCanThanhToan * 0.03;
        }
        double tienCuoiCung = tongTienCanThanhToan - tienGiamThem;
        System.out.println("[AirPay] Giam: " + tienGiamThem + "VND");
        System.out.println(">> Khach thanh toan: " + tienCuoiCung + "VND");
    }
}
