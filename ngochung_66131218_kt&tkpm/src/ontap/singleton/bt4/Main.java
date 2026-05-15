package ontap.singleton.bt4;

public class Main {
    public static void main(String[] args) {
        Program p1 = new Program("APP_A");
        Program p2 = new Program("APP_B");

        p1.WriteLog("He thong khoi dong", "10:00:00");
        p2.WriteLog("Nguoi dung dang nhap", "10:05:00");
        p1.WriteLog("Luu du lieu thanh cong", "10:10:00");

        Logger.getInstance().viewlog();
    }
}
