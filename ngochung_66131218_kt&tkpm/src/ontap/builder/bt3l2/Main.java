package ontap.builder.bt3l2;

public class Main {
    public static void main(String[] args) {
        Notification thongbao = new ConcreteBuilder().BuildTieuDe("ABC")
                .BuildNoiDung("ABC")
                .BuildBieuTuong("iCon")
                .BuildAmThanh("SonTon")
                .BuildDoUuTien("Thu 1")
                .BuildNutHanhDong("co, khong")
                .getResult();

        System.out.println("----THONG BAO----");
        thongbao.Show();
    }
}
