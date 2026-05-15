package behavioral.statepattern.CF2;

public class main {
    public static void main(String[] args) {
        // Khoi tao may ATM voi 7.000.000d (Trang thai ban dau: ReadyState)
        ATMMaChine atm = new ATMMaChine(7000000);

        // Giao dich 1: Rut 2.000.000 (Hop le)
        System.out.println("--- Giao dich 1 ---");
        atm.withdraw(2000000);

        // Giao dich 2: Rut 6.000.000 (Vuot han muc 5tr cua ReadyState)
        System.out.println("\n--- Giao dich 2 ---");
        atm.withdraw(6000000);

        // Giao dich 3: Rut 1.000.000 -> So du con 4tr (Chuyen sang LimitedState)
        System.out.println("\n--- Giao dich 3 ---");
        atm.withdraw(1000000);

        // Giao dich 4: Rut 3.500.000 (Hop le trong LimitedState)
        System.out.println("\n--- Giao dich 4 ---");
        atm.withdraw(3500000);

        // Giao dich 5: Rut 500.000 -> So du ve 0 (Chuyen sang OutOfMoneyState)
        System.out.println("\n--- Giao dich 5 ---");
        atm.withdraw(5000000); // Thu rut qua nhieu
        atm.withdraw(500000);

        // Giao dich 6: Rut khi da het tien
        System.out.println("\n--- Giao dich 6 ---");
        atm.withdraw(100000);
    }
}
