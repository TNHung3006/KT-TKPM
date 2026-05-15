package behavioral.strategy.mau;

public class main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new MomoPayment());
        cart.checkout(5000000);
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(5000000);
    }
}
