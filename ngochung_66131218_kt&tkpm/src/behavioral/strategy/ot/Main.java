package behavioral.strategy.ot;

public class Main {
    public static void main(String[] args) {
        GioHang dh1 = new GioHang();
        dh1.themMatHang(new MatHang("LAPTOP", 1, 2000000));
        dh1.themMatHang(new MatHang("MOUSE", 1, 500000));
        dh1.themMatHang(new MatHang("TV", 1, 3000000));
        dh1.setKhuyenMai(new KhuyenMaiPhanTram(10, 2000000));
        dh1.setThanhToan(new ThanhToanAirPay());
        dh1.thucHienThanhToan();
    }
}
