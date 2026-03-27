package behavioral.chain_of_responsibility.f88;

public class ChuTich extends NV_DuyetVay{

    public ChuTich(String ten, String chucVu, int hanMuc) {
        super(ten, chucVu, hanMuc);
    }

    @Override
    public NV_DuyetVay capTren(NV_DuyetVay capTren) {
        return null;
    }

    @Override
    public void duyetVay(int soTien) {
        if(soTien <= hanMuc)
            System.out.println(this.chucVu + " " + this.ten + "duyet khoan vay: " + soTien);
        else
            System.out.println("Cong ty tu choi cho vay");
    }
}
