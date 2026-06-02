package behavioral.statepattern.ot;

public class Main {
    public static void main(String[] args) {
        ThueBao simA = new ThueBao(250000);
        simA.inThongTin();

        simA.thucHienCuocGoi(12000);
        simA.inThongTin();

        simA.napTien(100000);
        simA.inThongTin();
    }
}
