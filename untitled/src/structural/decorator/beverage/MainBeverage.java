package structural.decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("Cafe Trung Nguyen so 1 TG");
        System.out.println("Lan 1");
        System.out.println(b.getDescription());
        System.out.println(b.cost());
        b = new Milk("Sua co gai Ha Lan", b);
        System.out.println("Lan 2");
        System.out.println(b.getDescription());
        System.out.println(b.cost());
        b = new Milk("Sua Ong Tho", b);
        System.out.println("Lan 3");
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
