package ontap.composite.CNP2;

public abstract class Nut {
    int giaTri;

    public Nut(int giaTri) {
        this.giaTri = giaTri;
    }

    public abstract void getGiaTri();
    public abstract void ThemTrai(Nut n);
    public abstract void ThemPhai(Nut n);
    public abstract void XoaTrai();
    public abstract void XoaPhai();
}
