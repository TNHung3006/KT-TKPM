package ot_ck_behavior.Observer_pattern.CA4l2;


public class Main {
    public static void main(String[] args) {
        Topic t = new Topic();

        ThanhVienA a = new ThanhVienA("Tran Ngoc Hung");
        ThanhVienB b = new ThanhVienB("Nguyen Van Tuan");

        t.dangKy(a);
        t.dangKy(b);
        t.taoTinMoi("hom nay troi dep");
        t.taoTinMoi("Hom nay troi khong mua");
        t.taoTinMoi("troi toi khong sao");
        t.capNhatTin(1, "ABC");
    }
}
