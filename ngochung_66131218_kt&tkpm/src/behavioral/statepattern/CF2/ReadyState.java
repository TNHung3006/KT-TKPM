package behavioral.statepattern.CF2;

public class ReadyState implements ATMState{
    @Override
    public void withdraw(ATMMaChine context, int amount) {
        if(amount > context.getMaxWithdrawal()){
            System.out.println("ERROR: Vuot qua han muc rut toi da (" + context.getMaxWithdrawal() + ") d/lan");
            return;
        }
        System.out.println("SUCCESS: Dang xuat so tien " + amount + " vnd....");
        context.setCashInMachine(context.getCashInMachine() - amount);
        System.out.println("So du may ATM con: " + context.getCashInMachine() +"d");
        if(context.getCashInMachine() == 0){
            context.setState(new OutOfMoneyState());
            System.out.println("[SYSTEM] May ATM da sang trang thai: HET TIEN");
        } else if (context.getCashInMachine() < context.getMaxWithdrawal()) {
            context.setState(new LimitedState());
            System.out.println("[SYSTEM] May ATM da sang trang thai: HAN CHE");
        }
    }
}
