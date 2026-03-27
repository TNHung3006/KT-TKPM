package behavioral.CA6;

public class Main {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData();
        Dashboard dashboard = new Dashboard();
        playerData. registerObserver(dashboard);
        System.out.println("=> [System] BAT DAU TRO CHOI: ");
        playerData.setGameData(300, 3, 0);
        System.out.println("=> [System] Nhan vat tieu diet quai (Cong diem): ");
        playerData.setGrade(100);
        System.out.println("=> [System] Nhan vat roi xuong vuc (Mat mang, cho hoi sinh): ");
        playerData.setGameData(250, 2, 100);
    }
}
