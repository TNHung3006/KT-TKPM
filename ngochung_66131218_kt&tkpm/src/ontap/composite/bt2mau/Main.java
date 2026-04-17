package ontap.composite.bt2mau;

public class Main {
    public static void main(String[] args) {
        Menu Pizza = new MonAn("Pizza", 100000);
        Menu KhoaiTayChien = new MonAn("KhoaiTayChien", 50000);
        Menu TraSua = new MonAn("TraSua", 30000);

        Menu combo1 = new Combo("Pizza va Tra Suat");
        combo1.Add(Pizza);
        combo1.Add(TraSua);

        Menu combo2 = new Combo("Dac biet");
        combo2.Add(Pizza);
        combo2.Add(KhoaiTayChien);
        combo2.Add(TraSua);

        Pizza.ShowTen();

        combo2.ShowTen();
    }
}
