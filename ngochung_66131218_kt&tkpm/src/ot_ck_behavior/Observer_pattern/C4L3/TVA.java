package ot_ck_behavior.Observer_pattern.C4L3;

public class TVA implements IObserver{
    private String ten;

    public TVA(String ten) {
        this.ten = ten;
    }

    @Override
    public void nhanTinMoi(Tin tin) {
        System.out.println("[ " + ten + " ] Da nhan tin moi voi noi dung la: " + tin.getNoiDung());
    }

    @Override
    public void capNhatTinMoi(Tin tin) {
        System.out.println("[ " + ten + " ] Da nhan cap nhat voi noi dung la: " + tin.getNoiDung());
    }
}
