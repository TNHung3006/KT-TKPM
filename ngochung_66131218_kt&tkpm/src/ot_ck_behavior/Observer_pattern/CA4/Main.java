package ot_ck_behavior.Observer_pattern.CA4;

public class Main {
    public static void main(String[] args) {
        Topic t = new Topic();

        ThanhVienA A = new ThanhVienA("Tran Van A");
        ThanhVienB B = new ThanhVienB("Nguyen Van B");

        t.dangKy(A);
        t.dangKy(B);
        t.taoTinMoi("Hom nay co gi moi!!!");
        t.taoTinMoi("Troi hom nay am u");
        t.capNhatTin(1, "Hom nay troi mua");

    }
}
