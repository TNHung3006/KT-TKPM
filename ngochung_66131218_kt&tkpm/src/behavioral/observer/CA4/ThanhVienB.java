package behavioral.observer.CA4;

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
        System.out.println("[" + ten + "] Da nhan tin moi. Danh sach toan bo tin hien co: ");
        for(int i = 0; i < danhSachTinNhanDuoc.size(); i++){
            System.out.println("--- " + (i + 1) + ". " + danhSachTinNhanDuoc.get(i).getNoiDung());
        }
    }

    @Override
    public void nhanTinCapNhat(TinTuc tin) {
        for(TinTuc tinCuaB : danhSachTinNhanDuoc){
            if(tinCuaB.getId() == tin.getId()){
                tinCuaB.setNoiDung(tin.getNoiDung());
                System.out.println("[" + ten + "] Da tu cap nhat Tin trong danh sach. Noi dung moi: "+ tinCuaB.getNoiDung());
                break;
            }
        }
    }
}