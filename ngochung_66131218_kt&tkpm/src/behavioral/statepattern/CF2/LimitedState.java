package behavioral.statepattern.CF2;

public class LimitedState implements ATMState{
    @Override
    public void withdraw(ATMMaChine context, int amount) {
        if(amount > context.getCashInMachine()){
            System.out.println("ERROR: May khong du tien mat. Chi co the rut toi da " + context.getCashInMachine() + "d.");
            return;
        }
        System.out.println("SUCCESS: Dang xuat so tien " + amount + " vnd...");
        context.setCashInMachine(context.getCashInMachine() - amount);
        System.out.println("So du may ATM con: " + context.getCashInMachine() + "d");
        if (context.getCashInMachine() == 0) {
            context.setState(new OutOfMoneyState());
            System.out.println("[SYSTEM] May ATM da chuyen sang trang thai: HET TIEN");
        }
    }
}
