package ot_ck_behavior.Observer_pattern.C4L3;

import java.util.ArrayList;
import java.util.List;

public class Topic implements ISubject{
    private List<IObserver> danhSachThanhVien = new ArrayList<>();
    private List<Tin> danhSachTin = new ArrayList<>();
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
    public void thongBaoTinTuc(Tin tin) {
        for(IObserver tv :  danhSachThanhVien){
            tv.nhanTinMoi(tin);
        }
    }

    @Override
    public void thongBaoCapNhat(Tin tin) {
        for(IObserver tv :  danhSachThanhVien){
            tv.capNhatTinMoi(tin);
        }
    }

    public void taoTinMoi(String noiDung){
        Tin tinMoi = new Tin(idCounter++, noiDung);
        danhSachTin.add(tinMoi);
        System.out.println("Da tao tin moi voi noi dung: " + noiDung);
        thongBaoTinTuc(tinMoi);
    }
    public void capNhatTin(int idTin, String noiDungMoi){
        for(Tin tin : danhSachTin){
            if(tin.getId() == idTin){
                tin.setNoiDung(noiDungMoi);
                System.out.println("Da cap nhat ID " + idTin + " thanh noi dung: " + tin.getNoiDung());
                thongBaoCapNhat(tin);
                break;
            }
        }
    }

}
