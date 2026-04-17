package ontap.decorator.bt5l2;

public class Main {
    public static void main(String[] args) {
        SanPham TraSua = new SanPhamCoBan("Tra Sua", "chocolate", 35000);

        TraSua = new ThemTopping(TraSua, 5000, "thach thuy tinh");
        TraSua = new MaGiamGia(TraSua, 10);

        System.out.println("San Pham");
        System.out.println("San Pham co ten la: " + TraSua.getTen());
        System.out.println("San Pham co gia la: " + TraSua.getGia());
    }
}
