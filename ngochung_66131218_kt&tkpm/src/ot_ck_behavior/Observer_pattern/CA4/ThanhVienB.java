package ot_ck_behavior.Observer_pattern.CA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements IObserver{
    private String ten;
    private List<TinTuc> danhSachTinNhanDuoc = new ArrayList<>();

    public ThanhVienB(String ten) {
        this.ten = ten;
    }

    @Override
    public void nhanTinMoi(TinTuc tin) {
        danhSachTinNhanDuoc.add(tin.copy());
        System.out.println("[ " + ten + " ] Da nhan tin moi: Danh sach tin da nhan duoc: ");
        for(int i = 0; i < danhSachTinNhanDuoc.size(); i++){
            System.out.println("---"+(i + 1)+"---" + danhSachTinNhanDuoc.get(i).getNoiDung());
        }
    }

    @Override
    public void nhanTinCapNhat(TinTuc tin) {
        for(TinTuc tincuaB : danhSachTinNhanDuoc){
            if(tincuaB.getId() == tin.getId()){
                tincuaB.setNoiDung(tin.getNoiDung());
                System.out.println("["+ ten + "] Da tu dong cap nhat. Noi dung moi:  " + tincuaB.getNoiDung());
                break;
            }
        }
    }
}
