package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;

public class PhoMaiPizza extends Pizza {
    @Override
    public void prepare() {
        this.getBuilder().append("Bột mì, pho mai, nhúc nhích, topping, gia vị, ...");
    }

    @Override
    public void bake() {
        this.getBuilder().append("\nNướng trên lò thang 17 phút");
    }

    @Override
    public void cut() {
        this.getBuilder().append("\nCắt làm 6 miếng");
    }

    @Override
    public void box() {
        this.getBuilder().append("\nĐóng gói, bỏ vào hộp");
    }
}
