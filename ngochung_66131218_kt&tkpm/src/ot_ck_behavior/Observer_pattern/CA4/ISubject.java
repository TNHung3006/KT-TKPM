package ot_ck_behavior.Observer_pattern.CA4;

public interface ISubject {
    public void dangKy(IObserver observer);
    public void huyDangKy(IObserver observer);
    public void thongBaoTinMoi(TinTuc tin);
    public void thongBaoCapNhat(TinTuc tin);
}
