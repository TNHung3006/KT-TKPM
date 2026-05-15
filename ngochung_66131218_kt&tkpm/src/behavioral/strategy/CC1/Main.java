package behavioral.strategy.CC1;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println("--Phep tinh 1--");
        context.setTinhToan(new Cong());
        System.out.println("Ket qua 75 + 12 = " + context.tinh(75, 12));
        System.out.println("--Phep tinh 2--");
        context.setTinhToan(new Tru());
        System.out.println("Ket qua 54 - 78 = " + context.tinh(54, 78));
    }
}
