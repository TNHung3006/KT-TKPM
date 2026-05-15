package tranngochung_66131218_thigk;

public class ThietBi_Hung extends ToaNha_Hung{
    public ThietBi_Hung(String tenThietBi_Hung, String trangthai_Hung, double congSuat_Hung) {
        super(tenThietBi_Hung, trangthai_Hung, congSuat_Hung);
    }

    @Override
    public void getThongtin_Hung() {
        System.out.println("Ten Thiet Bi: " + tenThietBi_Hung + " | Trang Thai: " + trangthai_Hung + " | Cong Suat: " + congSuat_Hung );
    }

    @Override
    public double getCongSuat_Hung() {
        return congSuat_Hung;
    }

    @Override
    public void Add_Hung(ToaNha_Hung n) {

    }

    @Override
    public void Remove_Hung(ToaNha_Hung n) {

    }
}
