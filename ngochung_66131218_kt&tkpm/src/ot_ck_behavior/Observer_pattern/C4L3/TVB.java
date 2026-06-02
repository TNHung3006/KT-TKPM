package ot_ck_behavior.Observer_pattern.C4L3;

import java.util.ArrayList;
import java.util.List;

public class TVB implements IObserver{
    private String ten;
    private List<Tin> danhSachTinNhanDuoc = new ArrayList<>();

    public TVB(String ten) {
        this.ten = ten;
    }

    @Override
    public void nhanTinMoi(Tin tin) {
        danhSachTinNhanDuoc.add(tin.copy());
        System.out.println("[ " + ten + " ] da nhan tin moi. Danh sach tin vua nhan duoc la: ");
        for(int i = 0; i < danhSachTinNhanDuoc.size(); i++){
            System.out.println("---" + (i + 1) + "." + danhSachTinNhanDuoc.get(i).getNoiDung());
        }
    }

    @Override
    public void capNhatTinMoi(Tin tin) {
        for(Tin tincuaB : danhSachTinNhanDuoc){
            if(tincuaB.getId() == tin.getId()){
                tincuaB.setNoiDung(tin.getNoiDung());
                System.out.println("[ "+ten+" ] Da cap nhat tin moi voi noi dung: " + tincuaB.getNoiDung() );
                break;
            }
        }
    }
}
