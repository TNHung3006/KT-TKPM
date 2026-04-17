package ontap.decorator.bt_milk;

public class TranChauDecorator extends ToppingDecorator{

    public TranChauDecorator(TraSua traSua) {
        super(traSua);
    }

    @Override
    public double TinhTien() {
        return super.TinhTien() + 5000;
    }
}
