package ontap.decorator.bt5;

public class Main {
    public static void main(String[] args) {
        SanPham traSua = new BasicSanPham("Tra Sua socola", "Thom ngon", 30000);


        traSua = new ToppingDecorator(traSua, "hat thuy tinh", 5000);
        traSua = new MagiamgiaDecorator(traSua, 30);

        System.out.println("San Pham");
        System.out.println("San pham co gia " +traSua.getGia());
        System.out.println(traSua.getMoTa());



    }
}
