package structural.decorator.beverage;

public class Milk extends CondimentDecorator{
    public Milk(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", "+ this.description;
    }
    @Override
    public float cost(){
        return super.cost() + 2000;
    }
}
