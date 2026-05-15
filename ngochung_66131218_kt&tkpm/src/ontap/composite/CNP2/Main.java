package ontap.composite.CNP2;

public class Main {
    public static void main(String[] args) {
        Nut goc = new NutTrong(6);
        Nut la1 = new NutTrong(1);
        Nut la3 = new NutTrong(3);
        Nut la5 = new NutTrong(5);
        Nut la7 = new NutTrong(7);
        Nut la9 = new NutTrong(9);

        goc.ThemTrai(la1);
        goc.ThemPhai(la3);

        la1.ThemTrai(la5);
        la1.ThemPhai(la7);
        la5.ThemTrai(la9);

        goc.getGiaTri();

    }
}
