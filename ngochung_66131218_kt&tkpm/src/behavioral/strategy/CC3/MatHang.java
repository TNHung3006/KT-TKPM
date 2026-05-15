package behavioral.strategy.CC3;

public class MatHang {
    private String tenMatHang;
    private int soLuong;
    private double donGia;

    public MatHang(String tenMatHang, int soLuong, double donGia) {
        this.tenMatHang = tenMatHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    public double getThanhTien(){
        return soLuong*donGia;
    }

    @Override
    public String toString() {
        return String.format("- %s: %d x %, .0f = %,.0f d", tenMatHang, soLuong, donGia, getThanhTien());
    }
}
