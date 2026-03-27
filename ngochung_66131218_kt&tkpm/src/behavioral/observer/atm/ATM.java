package behavioral.observer.atm;

public class ATM {
    ATMListener taiKhoan;
    public void nhanThe(ATMListener tk){
        taiKhoan = tk;
    }
    public void traThe(){
        taiKhoan = null;
    }

    public void rutTien(int soTien){
        if(taiKhoan == null){
            System.out.println("Moi dua the vao ATM");
            return;
        }
        if(taiKhoan.kiemTraSoDu(soTien))
            taiKhoan.nhanThongBao(soTien, true);
        else
            taiKhoan.nhanThongBao(soTien, false);
    }
}
