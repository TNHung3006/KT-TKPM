package ontap.composite.CayNP;

public class Main {
    public static void main(String[] args) {
        Nut goc = new NutTrong(7);
        Nut nl1 = new NutTrong(1);
        Nut nl5 = new NutTrong(5);
        Nut nl3 = new NutTrong(3);
        Nut nl8 = new NutTrong(8);
        Nut nl9 = new NutTrong(9);
        Nut nl6 = new NutTrong(6);

        goc.ThemTrai(nl1);
        goc.ThemPhai(nl5);

        nl1.ThemTrai(nl3);
        nl1.ThemPhai(nl8);

        nl5.ThemTrai(nl9);
        nl5.ThemPhai(nl6);
        System.out.println("Duyet cay theo NLR");
        goc.Duyet();


    }
}
