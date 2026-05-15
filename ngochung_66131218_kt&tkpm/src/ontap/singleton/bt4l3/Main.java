package ontap.singleton.bt4l3;

public class Main {
    public static void main(String[] args) {
        Program p1 = new Program("A123");
        Program p2 = new Program("B356");

        p1.Writelog("10h", "Da dang nhap");
        p2.Writelog("10h05", "Da cap nhat");
        p1.Writelog("10h10", "Da Luu");

        Logger.getInstance().showlog();
    }
}
