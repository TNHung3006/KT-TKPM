package behavioral.strategy.mau;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan " + amount + "vnd qua CreditCard thanh cong");
    }
}
