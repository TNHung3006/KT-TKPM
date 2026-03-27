package creational.factory.pizza;

import creational.factory.pizza.vietnam.VietNamPizzaStore;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore pz = new VietNamPizzaStore();
        Pizza pizza = pz.orderPizza(PizzaType.HAISAN);
        System.out.println(pizza.toString());
        System.out.println("\n");
        Pizza pizza1 = pz.createPizza(PizzaType.PHOMAI);
        System.out.println(pizza1.toString());
    }
}
