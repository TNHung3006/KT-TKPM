package behavioral.strategy.CC3;

public class Main {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();
        gioHang.themMatHang(new MatHang("Ban phim ASUS", 1, 2000000));
        gioHang.themMatHang(new MatHang("Chuot RAZER", 1, 5000000));

        gioHang.setHinhThucThanhToan(new ThanhToanCOD());
        gioHang.setHinhThucKhuyenMai(null);
        gioHang.thanhToan();
    }
}
