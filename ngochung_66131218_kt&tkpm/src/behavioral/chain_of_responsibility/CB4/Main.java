package behavioral.chain_of_responsibility.CB4;

public class Main {
    public static void main(String[] args) {
        String specialWinningNum = "123456";
        PrizeChecker specialPrize = new StandardPrizeChecker("Giai dac biet", new String[]{specialWinningNum});
        PrizeChecker consolationPrize = new ConsolationPrizeChecker(specialWinningNum);
        PrizeChecker firstPrize = new StandardPrizeChecker("Giai Nhat", new String[]{"3456", "1234"});
        PrizeChecker seconPrize = new StandardPrizeChecker("Giai nhi", new String[]{"456", "234"});

        specialPrize.setNextChecker(consolationPrize)
                .setNextChecker(firstPrize)
                .setNextChecker(seconPrize);
        System.out.println("--HE THONG DO VE SO--");
        specialPrize.checkTicket("123456");
        specialPrize.checkTicket("923456");
        specialPrize.checkTicket("093456");
        specialPrize.checkTicket("098456");
        specialPrize.checkTicket("000000");
    }
}
