package structural.decorator.beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(String description){
        super(description);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public float cost() {
        return 15710;
    }
}
