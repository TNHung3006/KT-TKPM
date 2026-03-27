package behavioral.observer.atm;

public class TaiKhoan implements ATMListener {
    String ten;
    int soDu;
    ATM atm;

    public TaiKhoan(String ten, int soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }

    @Override
    public boolean kiemTraSoDu(int soTien) {
        return (soDu - soTien) >= 50_000;
    }

    @Override
    public void nhanThongBao(int soTien, boolean thanhCong) {
        System.out.println("So du ban dau: " + soDu);
        if(thanhCong){
            System.out.println("so tien rut:" + soTien);
            soDu = soDu - soTien;
            System.out.println("so du con lai: " + soDu);
        }
        else {
            System.out.println("Rut tien khong thanh cong");
            System.out.println("so du cuoi " + soDu);
        }
    }
    public void duaThe(){
        atm.nhanThe(this);
    }
    public void nhanThe(){
        atm.traThe();
    }
}
