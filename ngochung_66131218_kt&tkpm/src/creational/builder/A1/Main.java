package creational.builder.A1;

public class Main {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDonBuilder()
                .setHeader("HD01", "05/02/2026", "Hung")
                .addChiTiet("Laptop DELL", 1, 20000, 0.01)
                .addChiTiet("Keyboard", 1, 2000, 0)
                .addChiTiet("Mouse", 1, 2000, 0)
                .build();
        System.out.println(hoaDon.toString());
    }
}
