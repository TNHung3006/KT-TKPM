package tranngochung_66131218_thigk;

import java.util.ArrayList;
import java.util.List;

public class KhuVuc_Hung extends ToaNha_Hung{
    private List<ToaNha_Hung> toanha = new ArrayList<>();

    String tenKhuVuc_Hung;

    public KhuVuc_Hung(String tenThietBi_Hung, String trangthai_Hung, double congSuat_Hung, String tenKhuVuc_Hung) {
        super(tenThietBi_Hung, trangthai_Hung, congSuat_Hung);
        this.tenKhuVuc_Hung = tenKhuVuc_Hung;
    }

    @Override
    public void getThongtin_Hung() {
        System.out.println("Ten Khu Vuc: " + tenKhuVuc_Hung);
        for(ToaNha_Hung tn : toanha){
            tn.getThongtin_Hung();
        }
        System.out.println("Tong gia cong suat: " + getCongSuat_Hung());
    }

    @Override
    public double getCongSuat_Hung() {
        int sum = 0;
        for (ToaNha_Hung tn : toanha){
            sum += tn.getCongSuat_Hung();
        }
        return sum;
    }

    @Override
    public void Add_Hung(ToaNha_Hung n) {
        toanha.add(n);
    }

    @Override
    public void Remove_Hung(ToaNha_Hung n) {
        toanha.remove(n);
    }
}
