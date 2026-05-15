package behavioral.statepattern.CF2;

public class OutOfMoneyState implements ATMState{
    @Override
    public void withdraw(ATMMaChine context, int amount) {
        System.out.println("REFUSE: Xin loi quy khach may ATM hien tai het tien");
    }
}
