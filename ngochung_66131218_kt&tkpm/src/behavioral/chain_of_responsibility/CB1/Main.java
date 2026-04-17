package behavioral.chain_of_responsibility.CB1;

public class Main {
    public static void main(String[] args) {
        int amoutTowithdraw = 293;
        System.out.println("--Cau a: Rut tien binh thuong" + "(Menh gia lon nhat la 500)--");
        MoneyDispenser defaultChain = ATM_Machine.getDispenserChain(500);
        defaultChain.dispense(amoutTowithdraw);

        System.out.println("--Cau b: Rut tien voi menh gia lon nhat" + "(duoc chon la 50)--");
        MoneyDispenser customChan = ATM_Machine.getDispenserChain(50);
        customChan.dispense(amoutTowithdraw);
    }
}
