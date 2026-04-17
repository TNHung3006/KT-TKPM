package behavioral.chain_of_responsibility.CB4;

public abstract class PrizeChecker {
    protected PrizeChecker nextChecker;
    public PrizeChecker setNextChecker(PrizeChecker nextChecker){
        this.nextChecker = nextChecker;
        return this.nextChecker;
    }
    public abstract void checkTicket(String ticketNumber);
}
