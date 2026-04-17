package behavioral.chain_of_responsibility.CB4;

public class StandardPrizeChecker extends PrizeChecker{
    private String prizeName;
    private String[] winningNumbers;

    public StandardPrizeChecker(String prizeName, String[] winningNumbers) {
        this.prizeName = prizeName;
        this.winningNumbers = winningNumbers;
    }

    @Override
    public void checkTicket(String ticketNumber) {
        boolean isWon = false;
        for(String winningNumber : winningNumbers){
            if(ticketNumber.endsWith(winningNumber)){
                isWon = true;
                break;
            }
        }
        if(isWon){
            System.out.println("CHUC MUNG! Ve so [" + ticketNumber + "] da trung: " + prizeName);
        } else if (nextChecker != null) {
            nextChecker.checkTicket(ticketNumber);
        }else {
            System.out.println("CHUC BAN MAY MAN LAN SAU!!!");
        }
    }
}
