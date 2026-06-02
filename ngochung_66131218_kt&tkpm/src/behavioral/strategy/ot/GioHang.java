package behavioral.strategy.ot;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private List<MatHang> danhSachMatHang = new ArrayList<>();
    private IKhuyenMaiStrategy khuyenMai = new KhongKhuyenMai();
    private IThanhToanStrategy thanhToan;

    public void themMatHang(MatHang mh){
        danhSachMatHang.add(mh);
    }
    public void setKhuyenMai(IKhuyenMaiStrategy khuyenMai){
        this.khuyenMai = khuyenMai;
    }
    public void setThanhToan(IThanhToanStrategy thanhToan){
        this.thanhToan = thanhToan;
    }
    private double tinhTongTienGoc(){
        double tong = 0;
        for(MatHang mh : danhSachMatHang){
            tong += mh.getThanhTien();
        }
        return tong;
    }
    public void thucHienThanhToan(){
        if(danhSachMatHang.isEmpty()){
            System.out.println("Gio hang trong!");
            return;
        }
        if(thanhToan == null){
            System.out.println("vui long chon phuong thuc thanh toan!!");
            return;
        }
        double tongTienGoc = tinhTongTienGoc();
        double tienGiamVoucher = khuyenMai.tinhTienGiam(tongTienGoc);
        double tienSauVoucher = tongTienGoc - tienGiamVoucher;
        System.out.println("--HOA DON THANH TOAN--");
        System.out.println("Tong tien hang goc " + String.format("%, .0f", tongTienGoc) + "VND");
        System.out.println("Ap dung ma khuyen mai " + String.format("%, .0f", tienGiamVoucher) + "VND");
        System.out.println("Thanh tien (sau KM): " + String.format("%, .0f", tienSauVoucher) + "VND");

        thanhToan.thanhToan(tienSauVoucher);
    }
}
