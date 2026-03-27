package creational.builder.A1;

public class HoaDonHeader {
    private String maHD, ngayban, tenKH;

    public HoaDonHeader(String maHD, String ngayban, String tenKH) {
        this.maHD = maHD;
        this.ngayban = ngayban;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "maHD='" + maHD + '\'' +
                ", ngayban='" + ngayban + '\'' +
                ", tenKH='" + tenKH + '\'' +
                '}';
    }
}
