package behavioral.strategy.CC2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String hoTen;
    private Date ngaySinh;
    private float diemTB;

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemTB() {
        return diemTB;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return String.format("Ho ten: %-20s | Ngay Sinh: %s " + "| Diem TB: %.2f", hoTen, sdf.format(ngaySinh), diemTB);
    }
}
