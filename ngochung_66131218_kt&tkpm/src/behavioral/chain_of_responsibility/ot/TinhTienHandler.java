package behavioral.chain_of_responsibility.ot;

public abstract class TinhTienHandler {
    protected TinhTienHandler capTiepTheo;

    public TinhTienHandler setCapTiepTheo(TinhTienHandler capTiepTheo) {
        this.capTiepTheo = capTiepTheo;
        return capTiepTheo;
    }
    public abstract void tinhTien(double soKhoiConLai, HoaDon hoaDon);
}
