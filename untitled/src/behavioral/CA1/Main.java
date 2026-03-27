package behavioral.CA1;

public class Main {
    public static void main(String[] args) {
        DataAccess dataAccess = new DataAccess();
        Client appClient = new Client();
        dataAccess.getStream().addListener(appClient);
        System.out.println("1. Them mon hoc moi: ");
        dataAccess.themMonHoc(new MonHoc("SOT301", "JAVA Web"));
        dataAccess.themMonHoc(new MonHoc("SOT302", "C++"));
        dataAccess.themMonHoc(new MonHoc("SOT303", "OOP"));
        System.out.println("2. Cap nhat mon hoc: ");
        dataAccess.capNhatMonHoc("SOT303", "C#");
        System.out.println("3. Xoa mon hoc: ");
        dataAccess.xoaMonHoc("SOT302");
    }
}
