package behavioral.strategy.mau;

public class MomoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan " + amount + "vnd qua vi momo thanh cong");
    }
}
