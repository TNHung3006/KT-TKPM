package ontap.composite.CayNP;

public abstract class Nut {
    int value;

    public Nut(int value) {
        this.value = value;
    }

    public abstract void Duyet();
    public abstract void ThemTrai(Nut n);
    public abstract void ThemPhai(Nut n);
    public abstract void XoaTrai();
    public abstract void XoaPhai();

}
