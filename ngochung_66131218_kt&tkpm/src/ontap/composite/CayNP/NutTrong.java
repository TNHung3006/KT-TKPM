package ontap.composite.CayNP;

public class NutTrong extends Nut{
    Nut Trai;
    Nut Phai;
    public NutTrong(int value) {
        super(value);
    }

    @Override
    public void Duyet() {
        System.out.println(value);
        if(Trai != null) this.Trai.Duyet();
        if(Phai != null) this.Phai.Duyet();
    }

    @Override
    public void ThemTrai(Nut n) {
        this.Trai = n;
    }

    @Override
    public void ThemPhai(Nut n) {
        this.Phai = n;
    }

    @Override
    public void XoaTrai() {
        this.Trai = null;
    }

    @Override
    public void XoaPhai() {
        this.Phai = null;
    }
}
