package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;
import creational.factory.pizza.PizzaStore;
import creational.factory.pizza.PizzaType;

public class VietNamPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type){
            case HAISAN -> {
                return new HaiSanPizza();
            }
        }
        return new HaiSanPizza();

//        switch (type){
//            case HAISAN:
//                return new HaiSanPizza();
//            case PHOMAI:
//                return new PhoMaiPizza();
//            default:
//                throw new IllegalAccessException("pizza type not suppot");
//        }
    }
}
