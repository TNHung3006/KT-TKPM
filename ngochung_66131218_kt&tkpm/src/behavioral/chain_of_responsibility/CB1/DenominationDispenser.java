package behavioral.chain_of_responsibility.CB1;

public class DenominationDispenser extends MoneyDispenser{
    private int denomination;

    public DenominationDispenser(int denomination) {
        this.denomination = denomination;
    }

    @Override
    public void dispense(int amount) {
        if(amount >= denomination){
            int count = amount / denomination;
            int remainder = amount % denomination;
            System.out.println("- " + count + "to menh gia " + denomination);
            if (remainder != 0 && nextDispenser != null){
                nextDispenser.dispense(remainder);
            } else if (remainder != 0) {
                System.out.println("Loi: Khong the chi tra so tien " + remainder);
            }
        } else if (nextDispenser != null) {
            nextDispenser.dispense(amount);
        }
    }
}
