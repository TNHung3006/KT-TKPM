package ontap.decorator.bt_milk;

public class ToppingDecorator implements TraSua{
    protected TraSua traSua;

    public ToppingDecorator(TraSua traSua) {
        this.traSua = traSua;
    }

    @Override
    public double TinhTien() {
        return traSua.TinhTien();
    }
}
