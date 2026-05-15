package ontap.singleton.bt4l2;

public class Main {
    public static void main(String[] args) {
        Program p1 = new Program("A123");
        Program p2 = new Program("B123");

        p1.WriteLog("10:00:00", "Dang nhap");
        p2.WriteLog("10:00:00", "Da Cap Nhat");
        p1.WriteLog("10:00:00", "Da Luu");

        Logger.getInstance().showlog();
    }
}
