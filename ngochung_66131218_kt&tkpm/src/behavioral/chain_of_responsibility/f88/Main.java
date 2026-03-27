package behavioral.chain_of_responsibility.f88;

public class Main {
    public static void main(String[] args) {
        NV_DuyetVay bv = new NhanVienChoVay("Le Bao Ve ", "bao ve:", 100_000);
        NV_DuyetVay nv = new NhanVienChoVay("Nguyen Nhan Vien ", "nhan vien:", 200_000);
        NV_DuyetVay tk = new NhanVienChoVay("Vo Thu Ky ", "thu ky:", 300_000);
        NV_DuyetVay gd = new NhanVienChoVay("Nguyen Giam Doc ", "giam doc:", 400_000);
        NV_DuyetVay ct = new ChuTich("Tran Chu Tich ", "chu tich:", 500_000);

        bv.capTren(nv).capTren(tk).capTren(gd).capTren(ct);

        bv.duyetVay(50_000);
        bv.duyetVay(150_000);
        bv.duyetVay(450_000);
        bv.duyetVay(550_000);

    }
}
