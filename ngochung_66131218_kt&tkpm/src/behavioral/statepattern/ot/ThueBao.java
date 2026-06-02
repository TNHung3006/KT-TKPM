package behavioral.statepattern.ot;

public class ThueBao {
    private ITrangThai trangThai;
    private double soDu;

    public ThueBao(double soDu){
        this.soDu =soDu;
        kiemTraVaCapNhatTrangThai();
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    private void kiemTraVaCapNhatTrangThai(){
        ITrangThai trangThaiMoi;
        String tenTrangThai = "";
        if(soDu <= 100000){
            trangThaiMoi = new TrangThaiThuong();
            tenTrangThai = "Thuong";
        }else if(soDu <= 200000){
            trangThaiMoi = new TrangThaiBac();
            tenTrangThai = "Bac";
        }else {
            trangThaiMoi = new TrangThaiVang();
            tenTrangThai = "Vang";
        }
        if(this.trangThai == null || !this.trangThai.getClass().equals(trangThaiMoi.getClass())){
            this.trangThai = trangThaiMoi;
            System.out.println("[SYSTEM] thue bao duoc chuyen sang trang thai" + tenTrangThai);
        }
    }

    public void napTien(double soTien){
        System.out.println("---Yeu cau nap " + soTien + "VND---");
        trangThai.napTien(this,soTien);
        kiemTraVaCapNhatTrangThai();
    }
    public void thucHienCuocGoi(int soGiay){
        System.out.println("---Yeu cau nap " + soGiay + "VND---");
        trangThai.thucHienCuocGoi(this, soGiay);
        kiemTraVaCapNhatTrangThai();
    }
    public void inThongTin(){
        trangThai.inThongTin(this);
    }
}
