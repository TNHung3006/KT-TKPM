package behavioral.strategy.ot;

public class ThanhToanCOD implements IThanhToanStrategy{
    @Override
    public void thanhToan(double tongTienCanThanhToan) {
        double tienGiamThem = 0;
        if(tongTienCanThanhToan >= 2000000){
            tienGiamThem = tongTienCanThanhToan * 0.02;
        }
        double tienCuoiCung = tongTienCanThanhToan - tienGiamThem;
        System.out.println("[COD] Giam: " + tienGiamThem + "VND");
        System.out.println(">> Khach thanh toan: " + tienCuoiCung + "VND");
    }
}
