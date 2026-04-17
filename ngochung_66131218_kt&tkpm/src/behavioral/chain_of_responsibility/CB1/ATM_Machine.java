package behavioral.chain_of_responsibility.CB1;

public class ATM_Machine {
    public static MoneyDispenser getDispenserChain(int maxDenomination){
        int[] availableDenominations = {500, 100, 50, 10, 1};
        MoneyDispenser headOfChain = null;
        MoneyDispenser currentDispenser = null;

        for(int denom : availableDenominations){
            if(denom <= maxDenomination){
                MoneyDispenser newDispenser = new DenominationDispenser(denom);
                if(headOfChain == null){
                    headOfChain = newDispenser;
                    currentDispenser = headOfChain;
                }else {
                    currentDispenser.setNextDispenser(newDispenser);
                    currentDispenser = newDispenser;
                }
            }
        }
        return headOfChain;
    }
}
