package ontap.composite.bt2l3;

public class Main {
    public static void main(String[] args) {
        Menu Pizza = new Dish("Pizza", 170000);
        Menu BanhMi = new Dish("Banh mi", 20000);
        Menu KhoaiTayChien = new Dish("Khoai tay chien", 70000);

        Menu Combo = new Combo("Dac biet", 0);

        Combo.Add(Pizza);
        Combo.Add(BanhMi);
        Combo.Add(KhoaiTayChien);
        System.out.println("---Mon An---");
        Pizza.getTen();
        System.out.println("---ComBo---");
        Combo.getTen();

    }
}
