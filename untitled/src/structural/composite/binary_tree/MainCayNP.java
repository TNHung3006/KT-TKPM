package structural.composite.binary_tree;

public class MainCayNP {
    public static void main(String[] args) {
        Nut goc = new NutTrong(10);
        Nut la8 = new NutTrong(8);
        Nut la12 = new NutTrong(12);
        Nut la6 = new NutTrong(6);
        Nut la7 = new NutTrong(7);
        Nut la11 = new NutTrong(11);
        Nut la13 = new NutTrong(13);
        goc.themTrai(la8);
        goc.themPhai(la12);

        la8.themTrai(la6);
        la8.themPhai(la7);

        la12.themTrai(la11);
        la12.themPhai(la13);

        System.out.println("Cay NP co gia tri cac nut theo NLR la: ");
        goc.duyet();

    }
}
