package structural.decorator.beverage;

public class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public float cost() {
        return beverage.cost();
    }
}
