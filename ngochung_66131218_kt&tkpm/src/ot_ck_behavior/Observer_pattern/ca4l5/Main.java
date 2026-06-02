package ot_ck_behavior.Observer_pattern.ca4l5;

public class Main {
    public static void main(String[] args) {
        Topic t = new Topic();
        TVA a = new TVA("A B C");
        TVA b = new TVA("B B B");

        t.dangKy(a);
        t.dangKy(b);
        t.taoTinMoi("A B C");
        t.taoTinMoi("D E F");
        t.taoTinMoi("HTHTHT");
        t.capNhatTin(1, "Hom nay troi dep");
        t.capNhatTin(1, "Hom nay troi xau");


    }
}
