package ontap.composite.bt2l4;

public class Main {
    public static void main(String[] args) {
        Menu CaChien = new Dish("Ca Chien", "Gion` beo'", 200000);
        Menu ComChienTrung = new Dish("Com chien trung", "Thom ngon", 50000);
        Menu Cocacola = new Dish("Cocacola", "Nuoc ngot co gas", 15000);

        Menu Combo = new Combo("Tron ven", "Day du cho 2 nguoi an", 0);
        Combo.Add(CaChien);
        Combo.Add(ComChienTrung);
        Combo.Add(Cocacola);

        Combo.getMota();

    }
}