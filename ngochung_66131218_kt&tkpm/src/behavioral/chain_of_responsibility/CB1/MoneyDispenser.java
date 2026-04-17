package behavioral.chain_of_responsibility.CB1;

public abstract class MoneyDispenser {
    protected MoneyDispenser nextDispenser;

    public void setNextDispenser(MoneyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }
    public  abstract void dispense(int amount);
}
