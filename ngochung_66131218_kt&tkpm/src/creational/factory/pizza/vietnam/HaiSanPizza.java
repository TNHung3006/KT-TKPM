package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;

public class HaiSanPizza extends Pizza {
    @Override
    public void prepare(){
        this.getBuilder().append("Bột mì, gia vị, 4 con tôm, 4 con mựt");
    }
    @Override
    public void bake(){
        this.getBuilder().append("\nNướng trên lò than 20 phút");
    }
    @Override
    public void cut(){
        this.getBuilder().append("\nCắt làm 4 miếng");
    }
    @Override
    public void box(){
        this.getBuilder().append("\nLót giấy, bỏ vào hộp và loot");
    }
}
