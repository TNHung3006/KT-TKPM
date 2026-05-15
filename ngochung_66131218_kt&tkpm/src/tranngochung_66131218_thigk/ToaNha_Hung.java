package tranngochung_66131218_thigk;

public abstract class ToaNha_Hung {
    String tenThietBi_Hung, trangthai_Hung;
    double congSuat_Hung;

    public ToaNha_Hung(String tenThietBi_Hung, String trangthai_Hung, double congSuat_Hung) {
        this.tenThietBi_Hung = tenThietBi_Hung;
        this.trangthai_Hung = trangthai_Hung;
        this.congSuat_Hung = congSuat_Hung;
    }

    public abstract void getThongtin_Hung();
    public abstract double getCongSuat_Hung();
    public abstract void Add_Hung(ToaNha_Hung n);
    public abstract void Remove_Hung(ToaNha_Hung n);

}
