package behavioral.observer.atm;

public interface ATMListener { //
    boolean kiemTraSoDu(int soTien);
    void nhanThongBao(int soTien, boolean thanhCong);
}
