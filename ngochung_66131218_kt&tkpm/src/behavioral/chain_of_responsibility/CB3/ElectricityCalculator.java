package behavioral.chain_of_responsibility.CB3;
//1. lop truu tuong (Handler)
public abstract class ElectricityCalculator {
    protected ElectricityCalculator nextCalculator;
    public ElectricityCalculator setNextCalculator(ElectricityCalculator nextCalculator){
        this.nextCalculator = nextCalculator;
        return this.nextCalculator;
    }
    public abstract double calculateBill(int kwh);

}
