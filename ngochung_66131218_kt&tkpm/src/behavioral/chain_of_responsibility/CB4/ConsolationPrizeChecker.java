package behavioral.chain_of_responsibility.CB4;

public class ConsolationPrizeChecker extends PrizeChecker{
    private String specialPrizeNumber;

    public ConsolationPrizeChecker(String specialPrizeChecker) {
        this.specialPrizeNumber = specialPrizeChecker;
    }

    @Override
    public void checkTicket(String ticketNumber) {
        String last5ofSpecial = specialPrizeNumber.substring(1);
        if(!ticketNumber.equals(specialPrizeNumber) && ticketNumber.endsWith(last5ofSpecial)){
            System.out.println("CHUC MUNG! Ve So [" + ticketNumber + "] da trung: Giai Khuyen Khich");
        } else if (nextChecker != null) {
            nextChecker.checkTicket(ticketNumber);
        }
    }
}
