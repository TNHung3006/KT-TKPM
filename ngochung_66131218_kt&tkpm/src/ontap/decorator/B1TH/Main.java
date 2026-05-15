package ontap.decorator.B1TH;

public class Main {
    public static void main(String[] args) {
        // 7*3-6*2

        BieuThuc giatri = new BieuThucDonGian(7);
        BieuThuc giatri1 = new BieuThucDonGian(6);

        giatri = new Nhan(giatri, 3);
        giatri1 = new Nhan(giatri1, 2);

        System.out.println("KETQUA");
        System.out.println("Bieu thuc 1: " + giatri1.bieuThuc() + " Co gia tri" +giatri1.giaTri());
    }
}
