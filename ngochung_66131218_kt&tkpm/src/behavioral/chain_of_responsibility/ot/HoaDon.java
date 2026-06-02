package behavioral.chain_of_responsibility.ot;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private  String maKH;
    private String tenKH;
    private double tongSoKhoi;
    private double tongTien;
    private List<String> chiTietTungBac;

    public HoaDon(String maKH, String tenKH, double tongSoKhoi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.tongSoKhoi = tongSoKhoi;
        this.tongTien = 0;
        this.chiTietTungBac = new ArrayList<>();
    }
    public void congTien(double tien){
        this.tongTien +=tien;
    }
    public void themChiTiet(String chiTiet){
        this.chiTietTungBac.add(chiTiet);
    }
    public void inHoaDon(){
        System.out.println("---HOA DON TIEN NUOC---");
        System.out.println("Ma khach hang: " + maKH);
        System.out.println("Ten khach hang: " + tenKH);
        System.out.println("So m3 su dung: "+ tongSoKhoi);
        System.out.println("--CHI TIET TINH TIEN--");
        for(String chitiet : chiTietTungBac){
            System.out.println(chitiet);
        }
        System.out.println("==========================================");
        System.out.println("Tong tien phai tra: " + tongTien + "VND");
    }
}
