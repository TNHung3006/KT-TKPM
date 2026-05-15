package behavioral.statepattern.CF2;

public class ATMMaChine {
    private ATMState currentState;
    private int cashInMachine;
    private final int MAX_WITHDRAWAL = 5000000;
    public ATMMaChine(int initialCash){
        this.cashInMachine = initialCash;
        if(this.cashInMachine == 0){
            this.currentState = new OutOfMoneyState();
        }else if (this.cashInMachine < MAX_WITHDRAWAL){
            this.currentState = new LimitedState();
        }else{
            this.currentState = new ReadyState();
        }
    }
    public void withdraw(int amount){
        currentState.withdraw(this, amount);
    }
    public void setState(ATMState state){
        this.currentState = state;
    }
    public int getCashInMachine(){
        return cashInMachine;
    }
    public void setCashInMachine(int cashInMachine){
        this.cashInMachine = cashInMachine;
    }
    public int getMaxWithdrawal(){
        return MAX_WITHDRAWAL;
    }

}
