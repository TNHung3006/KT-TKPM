package ot_ck_behavior.Observer_pattern.ca4l5;

public class TVA implements IObserver{
    private String ten;

    public TVA(String ten) {
        this.ten = ten;
    }

    @Override
    public void nhanTinMoi(TinTuc tin) {
        System.out.println("[ " + ten +" ] Da nhan duoc tin: " + tin.getNoiDung() );
    }

    @Override
    public void capNhatTinMoi(TinTuc tin) {
        System.out.println("[ " + ten +" ] Da cap nhat tin " + tin.getNoiDung() );
    }

}
