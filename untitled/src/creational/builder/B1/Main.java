package creational.builder.B1;

public class Main {
    public static void main(String[] args) {
        BieuThuc bieuThuc = new BieuThucDonGian(6);
        BieuThuc bieuThuc1 = new BieuThucDonGian(8);
        BieuThuc bieuThuc2 = new BieuThucDonGian(2);
        System.out.println("gia tri ban dau bt la: " + bieuThuc.giaTri());
        //(6+9)*8+5
        bieuThuc = new Cong(bieuThuc, 9);
        bieuThuc = new Nhan(bieuThuc, 8);
        bieuThuc = new Cong(bieuThuc, 5);
        System.out.println("Bieu thuc" + bieuThuc.bieuThuc());
        System.out.println("gia tri sau khi tinh bieu thuc la: " + bieuThuc.giaTri());

        //(8+6)/2*5+8-4
        System.out.println("gia tri ban dau bt1 la: " + bieuThuc1.giaTri());
        bieuThuc1 = new Cong(bieuThuc1, 6);
        bieuThuc1 = new Chia(bieuThuc1, 2);
        bieuThuc1 = new Nhan(bieuThuc1, 5);
        bieuThuc1 = new Cong(bieuThuc1, 8);
        bieuThuc1 = new Tru(bieuThuc1, 4);
        System.out.println("Bieu thuc" + bieuThuc1.bieuThuc());
        System.out.println("gia tri sau khi tinh bieu thuc 1 la: " + bieuThuc1.giaTri());

        //3 * (2+5)
        System.out.println("gia tri ban dau bt2 la: " + bieuThuc2.giaTri());
        bieuThuc2 = new Cong(bieuThuc2, 5);
        bieuThuc2 = new Nhan(bieuThuc2, 3);
        System.out.println("Bieu thuc" + bieuThuc2.bieuThuc());
        System.out.println("gia tri sau khi tinh bieu thuc 2 la: " + bieuThuc2.giaTri());




    }
}
