package ontap.decorator.bt_milk;

public class KemCheeseDecorator extends ToppingDecorator{
    public KemCheeseDecorator(TraSua traSua) {
        super(traSua);
    }

    @Override
    public double TinhTien() {
        return super.TinhTien() + 10000;
    }
}
