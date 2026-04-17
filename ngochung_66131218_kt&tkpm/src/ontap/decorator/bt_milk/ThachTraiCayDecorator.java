package ontap.decorator.bt_milk;

public class ThachTraiCayDecorator extends ToppingDecorator{
    public ThachTraiCayDecorator(TraSua traSua) {
        super(traSua);
    }

    @Override
    public double TinhTien() {
        return super.TinhTien() + 7000;
    }
}
