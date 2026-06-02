package ot_ck_behavior.Observer_pattern.C4L3;

public interface ISubject {
    public void dangKy(IObserver observer);
    public void huyDangKy(IObserver observer);
    public void thongBaoTinTuc(Tin tin);
    public void thongBaoCapNhat(Tin tin);
}
