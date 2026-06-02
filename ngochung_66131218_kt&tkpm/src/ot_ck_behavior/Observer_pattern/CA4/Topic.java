package ot_ck_behavior.Observer_pattern.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic implements ISubject{
    private List<IObserver> danhSachThanhVien = new ArrayList<>();
    private List<TinTuc> danhSachTin = new ArrayList<>();
    private int idCounter = 1;

    @Override
    public void dangKy(IObserver observer) {
        danhSachThanhVien.add(observer);
    }

    @Override
    public void huyDangKy(IObserver observer) {
        danhSachThanhVien.remove(observer);
    }

    @Override
    public void thongBaoTinMoi(TinTuc tin) {
        for(IObserver tv : danhSachThanhVien){
            tv.nhanTinMoi(tin);
        }
    }

    @Override
    public void thongBaoCapNhat(TinTuc tin) {
        for(IObserver tv : danhSachThanhVien) {
            tv.nhanTinCapNhat(tin);
        }
    }

    public void taoTinMoi(String noiDung){
        TinTuc tinMoi = new TinTuc(idCounter++, noiDung);
        danhSachTin.add(tinMoi);
        System.out.println("Da tao tin moi" + noiDung);
        thongBaoTinMoi(tinMoi);
    }
    public void capNhatTin(int idTin, String noiDungMoi){
        for(TinTuc tin : danhSachTin){
            if(tin.getId() == idTin){
                tin.setNoiDung(noiDungMoi);
                System.out.println("Da cap nhat tin ID " + idTin + " thanh: " + noiDungMoi);
                thongBaoCapNhat(tin);
                break;
            }
        }
    }
}
