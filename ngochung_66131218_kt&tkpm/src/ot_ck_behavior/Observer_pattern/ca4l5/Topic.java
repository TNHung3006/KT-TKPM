package ot_ck_behavior.Observer_pattern.ca4l5;

import java.util.ArrayList;
import java.util.List;

public class Topic implements ISubJect{
    private List<IObserver> danhSachThanhVien = new ArrayList<>();
    private List<TinTuc> danhSachTin = new ArrayList<>();
    int idCounter;

    @Override
    public void dangKy(IObserver observer) {
        danhSachThanhVien.add(observer);
    }

    @Override
    public void huyDangKy(IObserver observer) {
        danhSachThanhVien.add(observer);
    }

    @Override
    public void ThongBaoTinMoi(TinTuc tin) {
        for(IObserver tv : danhSachThanhVien){
            tv.nhanTinMoi(tin);
        }
    }

    @Override
    public void ThongBaoCapNhat(TinTuc tin) {
        for(IObserver tv : danhSachThanhVien){
            tv.capNhatTinMoi(tin);
        }
    }
    public void taoTinMoi(String noiDung){
        TinTuc tinmoi = new TinTuc(idCounter++, noiDung);
        danhSachTin.add(tinmoi);
        System.out.println("Da tao tin moi voi noi dung: " + noiDung);
        ThongBaoTinMoi(tinmoi);
    }
    public void capNhatTin(int idTin, String noiDungMoi){
        for(TinTuc tin : danhSachTin){
            if(tin.getId() == idTin){
                tin.setNoiDung(noiDungMoi);
                System.out.println("Da cap nhat id tin moi voi noi dung: " + noiDungMoi);
                ThongBaoCapNhat(tin);
                break;
            }
        }
    }
}
