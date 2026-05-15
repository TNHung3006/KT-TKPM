package behavioral.strategy.CC3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private List<MatHang> dsMatHang = new ArrayList<>();
    private IThanhToan hinhThucThanhToan;
    private IKhuyenMai hinhThucKhuyenMai;
    public void themMatHang(MatHang mh){
        dsMatHang.add(mh);
    }
    public void setHinhThucThanhToan(IThanhToan hinhThucThanhToan){
        this.hinhThucThanhToan = hinhThucThanhToan;
    }
    public void setHinhThucKhuyenMai(IKhuyenMai hinhThucKhuyenMai){
        this.hinhThucKhuyenMai = hinhThucKhuyenMai;
    }
    private double tinhTongTienHang(){
        double tong = 0;
        for(MatHang mh : dsMatHang){
            tong += mh.getThanhTien();
        }
        return tong;
    }
    public void thanhToan(){
        System.out.println("---HOA DON THANH TOAN---");
        double tongTienHang =tinhTongTienHang();
        for (MatHang mh:dsMatHang){
            System.out.println(mh.toString());
        }
        System.out.println("----------------------------------------");
        System.out.printf("Tong tien hang: %,.0f d\n", tongTienHang);
        double tienGiamThanhToan = 0;
        if(hinhThucThanhToan != null){
            tienGiamThanhToan = hinhThucThanhToan.tinhTienGiam(tongTienHang);
            System.out.printf("Giam gia thanh toan: -%,.0f d\n", tienGiamThanhToan);
        }
        double tienKhuyenMai = 0;
        if(hinhThucKhuyenMai != null){
            tienKhuyenMai = hinhThucKhuyenMai.tinhTienKhuyenMai(tongTienHang);
            System.out.printf("Tien Khuyen mai: -%,.0f d\n", tienKhuyenMai);
        }
        double tienCanThanhToan = tongTienHang - tienGiamThanhToan - tienKhuyenMai;
        tienCanThanhToan = Math.max(tienCanThanhToan,0);
        System.out.println("-------------------------------------");
        System.out.printf("SO TIEN CAN THANH TOAN: %,.0f VND \n", tienCanThanhToan);
        System.out.println("-------------------------------------");
    }
}
