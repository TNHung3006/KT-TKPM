package ontap.decorator.bt5a;

public class Main {
    public static void main(String[] args) {
        SanPham Pizza = new BasicSanPham("Pizza", "ngon", 120000);
        SanPham TraSua = new BasicSanPham("Tra Sua", "ngot", 20000);

        Pizza = new Topping(Pizza, "xuc xich", 10000);
        Pizza = new Sot(Pizza, "sot", 12000);

        System.out.println(Pizza.getMota());
    }
}
