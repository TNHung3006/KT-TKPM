package structural.composite.binary_tree;

public abstract class Nut {
    int giaTri;

    public Nut(int giaTri) {
        this.giaTri = giaTri;
    }

    public abstract void duyet(); // in gia tri cua nut ra man hinh

    public abstract void themTrai(Nut n);
    public abstract void themPhai( Nut n);
    public abstract void XoaTrai();
    public abstract void XoaPhai();



}
