package ot_ck_behavior.Observer_pattern.C4L3;

public class Main {
    public static void main(String[] args) {
        Topic t = new Topic();

        TVA a = new TVA("Tran nGOC A");
        TVB B = new TVB("Tran nGOC B");

        t.dangKy(a);
        t.dangKy(B);
        t.taoTinMoi("bay gio la buoi toi");
        t.taoTinMoi("Chinh xac la dang 10h");
        t.capNhatTin(1, "khong bay gio la 10h30 roi");
    }
}
