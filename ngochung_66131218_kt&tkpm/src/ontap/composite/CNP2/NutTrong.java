package ontap.composite.CNP2;

public class NutTrong extends Nut{
    Nut Trai;
    Nut Phai;

    public NutTrong(int giaTri) {
        super(giaTri);
    }

    @Override
    public void getGiaTri() {
        System.out.println(giaTri);
        if(Trai != null) Trai.getGiaTri();
        if(Phai != null) Phai.getGiaTri();
    }

    @Override
    public void ThemTrai(Nut n) {
        Trai = n;
    }

    @Override
    public void ThemPhai(Nut n) {
        Phai = n;
    }

    @Override
    public void XoaTrai() {
        Trai = null;
    }

    @Override
    public void XoaPhai() {
        Phai = null;
    }
}
