package behavioral.chain_of_responsibility.CB3;

public class Main {
    public static void main(String[] args) {
        ElectricityCalculator tier1 = new TierCalculator("Bac 1 (0-50kwh)", 50, 1806);
        ElectricityCalculator tier2 = new TierCalculator("Bac 2 (51-100kwh)", 50, 1866);
        ElectricityCalculator tier3 = new TierCalculator("Bac 3 (101-200kwh)", 100, 2167);
        ElectricityCalculator tier4 = new TierCalculator("Bac 4 (201-300kwh)", 100, 2729);
        ElectricityCalculator tier5 = new TierCalculator("Bac 5 (301-400kwh)", 100, 3050);
        ElectricityCalculator tier6 = new TierCalculator("Bac 6 (>=401kwh)", Integer.MAX_VALUE, 3151);

        tier1.setNextCalculator(tier2)
                .setNextCalculator(tier3)
                .setNextCalculator(tier4)
                .setNextCalculator(tier5)
                .setNextCalculator(tier6);
        testCalculateBill(tier1, 40);
        testCalculateBill(tier1, 140);
        testCalculateBill(tier1, 500);
    }
    private static void testCalculateBill(ElectricityCalculator chainHead, int kwh){
        System.out.println("--HOA DON CHO GIA DINH DUNG--"+ kwh + " kwh---");
        double totalBill = chainHead.calculateBill(kwh);
        System.out.println("==> Tong Tien: " +totalBill+" VND");
    }
}
