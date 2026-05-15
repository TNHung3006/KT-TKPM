package tranngochung_66131218_thigk;

public class Main_Hung {
    public static void main(String[] args) {
        ToaNha_Hung MayTinh = new ThietBi_Hung("May Tinh", "Bat", 20);
        ToaNha_Hung TV = new ThietBi_Hung("Ti Vi", "Tat", 15);
        ToaNha_Hung BepTu = new ThietBi_Hung("BepTu", "Bat", 30);
        ToaNha_Hung TuLanh = new ThietBi_Hung("TuLanh", "Bat", 50);
        ToaNha_Hung MayGiat = new ThietBi_Hung("MayGiat", "Bat", 25);

        ToaNha_Hung A = new KhuVuc_Hung(" ", " ", 0, "Phong Khach");
        ToaNha_Hung B = new KhuVuc_Hung(" ", " ", 0, "Phong Ngu");
        ToaNha_Hung C = new KhuVuc_Hung(" ", " ", 0, "Ca Toa Nha") {
        };

        A.Add_Hung(TV);
        A.Add_Hung(BepTu);
        A.Add_Hung(MayTinh);

        B.Add_Hung(TV);
        B.Add_Hung(MayTinh);

        C.Add_Hung(TV);
        C.Add_Hung(MayTinh);
        C.Add_Hung(TuLanh);
        C.Add_Hung(MayTinh);
        C.Add_Hung(BepTu);

        System.out.println("===Thong Tin Khu Vuc A===");
        A.getThongtin_Hung();
        System.out.println("===Thong Tin Khu Vuc B===");
        B.getThongtin_Hung();

        System.out.println("===Thong Tin Ca Toa Nha===");
        C.getThongtin_Hung();
    }
}
