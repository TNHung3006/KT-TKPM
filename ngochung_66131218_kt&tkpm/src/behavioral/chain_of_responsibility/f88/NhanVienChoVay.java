package behavioral.chain_of_responsibility.f88;

public class NhanVienChoVay extends NV_DuyetVay {

    NV_DuyetVay capTren;

    public NhanVienChoVay(String ten, String chucVu, int hanMuc) {
        super(ten, chucVu, hanMuc);
    }

    @Override
    public NV_DuyetVay capTren(NV_DuyetVay capTren) {
        this.capTren = capTren;
        return this.capTren;
    }

    @Override
    public void duyetVay(int soTien) {
        if(soTien <= hanMuc)
            System.out.println(this.chucVu + " " + this.ten + "duyet khoan vay: " + soTien);
        else
            capTren.duyetVay(soTien);
    }
}
