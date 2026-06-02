package behavioral.chain_of_responsibility.ot;

public class Main {
    public static void main(String[] args) {
        TinhTienHandler bac1 = new TinhTienBac1();
        TinhTienHandler bac2 = new TinhTienBac2();
        TinhTienHandler bac3 = new TinhTienBac3();
        TinhTienHandler bac4 = new TinhTienBac4();
        bac1.setCapTiepTheo(bac2).setCapTiepTheo(bac3).setCapTiepTheo(bac4);
        HoaDon hd1 = new HoaDon("KH0001", "KHA", 15);
        bac1.tinhTien(15,hd1);
        hd1.inHoaDon();

        HoaDon hd2 = new HoaDon("KH0002", "KHB", 50);
        bac1.tinhTien(50, hd2);
        hd2.inHoaDon();

    }
}
