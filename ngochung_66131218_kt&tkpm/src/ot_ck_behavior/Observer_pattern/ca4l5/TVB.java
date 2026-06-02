package ot_ck_behavior.Observer_pattern.ca4l5;

import java.util.List;

public class TVB implements IObserver{
    private String ten;
    List<TinTuc> danhSachTinNhanDuoc;

    public TVB(String ten) {
        this.ten = ten;
    }

    @Override
    public void nhanTinMoi(TinTuc tin) {
        danhSachTinNhanDuoc.add(tin.copy());
        System.out.println("[ " + ten + " ] Da nhan tin moi. Danh sach tin moi nhan duoc la: " );
        for(int i = 0; i < danhSachTinNhanDuoc.size(); i++){
            System.out.println("[ " + (i + 1) + " ] " + danhSachTinNhanDuoc.get(i).getNoiDung());
        }
    }

    @Override
    public void capNhatTinMoi(TinTuc tin) {
        for(TinTuc tincuaB : danhSachTinNhanDuoc){
            if(tincuaB.getId() == tin.getId()){
                tincuaB.setNoiDung(tin.getNoiDung());
                System.out.println("[ " + ten + " ] Da cap nhat trong danh sach. Noi Dung moi: " + tincuaB.getNoiDung());
                break;
            }
        }
    }
}
