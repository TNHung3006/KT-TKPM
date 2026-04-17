package ontap.decorator.bt_milk;

public class Main {
    public static void main(String[] args) {
        TraSua ts = new TraSuaTruyenThong(30000);

        ts = new TranChauDecorator(ts);
        ts = new KemCheeseDecorator(ts);

        System.out.println("Tra sua sau khi them topping co gia la: " + ts.TinhTien());

    }
}
