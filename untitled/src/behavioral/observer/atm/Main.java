package behavioral.observer.atm;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan taiKhoan = new TaiKhoan("Hung", 17_000_000, atm);
        System.out.println("Lan 1: ");
        atm.rutTien(10_000_000);
        taiKhoan.duaThe();
        System.out.println("Lan 2: ");
        atm.rutTien(10_000_000);
        System.out.println("Lan 3: ");
        atm.rutTien(15_000_000);
        System.out.println("Lan 4: ");
        atm.rutTien(7_000_000);
        taiKhoan.nhanThe();
        System.out.println("Lan 5: ");
        atm.rutTien(2_000_000);
    }
}
