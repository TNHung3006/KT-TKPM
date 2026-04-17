package behavioral.chain_of_responsibility.CB3;

public class TierCalculator extends ElectricityCalculator {
    private String tierName;
    private int capacity;
    private double price;

    public TierCalculator(String tierName, int capacity, double price) {
        this.tierName = tierName;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public double calculateBill(int kwh) {
        if(kwh < 0) return 0;
        int kwhToProcess = Math.min(kwh, capacity);
        double cost = kwhToProcess * price;
        System.out.println("-" +tierName+ "tinh tien: " + kwhToProcess + "kwh x" + price + " = " +cost + " VND");
        int remainingkwh = kwh - kwhToProcess;
        if(remainingkwh > 0 && nextCalculator != null){
            cost += nextCalculator.calculateBill(remainingkwh);
        }
        return cost;
    }
}
