package ot_ck_behavior.Observer_pattern.CA4l2;

import java.util.ArrayList;
import java.util.List;

public class Topic implements ISubject{
    private List<IObserver> danhSachThanhVien = new ArrayList<>();
    private List<TinTuc> danhSachTinTuc = new ArrayList<>();
    int idCounter = 1;

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
        for(IObserver tv : danhSachThanhVien){
            tv.nhanTinCapNhat(tin);
        }
    }

    public void taoTinMoi(String noiDung){
        TinTuc tinmoi = new TinTuc(idCounter++, noiDung);
        danhSachTinTuc.add(tinmoi);
        System.out.println("Da tao tin moi: " + noiDung);
        thongBaoTinMoi(tinmoi);

    }
    public void capNhatTin(int idTin, String noiDungMoi){
        for(TinTuc tin : danhSachTinTuc){
            if(tin.getId() == idTin){
                tin.setNoiDung(noiDungMoi);
                System.out.println("Da cap nhat ID" + idTin + "thanh: " + noiDungMoi);
                thongBaoCapNhat(tin);
                break;
            }
        }
    }
}
