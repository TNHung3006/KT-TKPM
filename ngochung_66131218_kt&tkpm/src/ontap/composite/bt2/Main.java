package ontap.composite.bt2;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo các món đơn
        Menu gaRan = new MonAn("Gà rán", 35000);
        Menu khoaiTay = new MonAn("Khoai tây chiên", 20000);
        Menu pepsi = new MonAn("Pepsi", 15000);

        // 2. Tạo Combo 1
        Menu combo1 = new Combo("Gà & Khoai");
        combo1.Add(gaRan);
        combo1.Add(khoaiTay);

        // 3. Tạo Combo lớn chứa Combo 1
        Menu comboSieuCap = new Combo("Siêu Cấp");
        comboSieuCap.Add(combo1); // Thêm combo vào combo
        comboSieuCap.Add(pepsi);

        // 4. Hiển thị
        System.out.println("----------- CHI TIẾT THỰC ĐƠN -----------");
        gaRan.ShowInfo();
        comboSieuCap.ShowInfo();
    }
}