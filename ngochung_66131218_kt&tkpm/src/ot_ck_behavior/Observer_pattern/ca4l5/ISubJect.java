package ot_ck_behavior.Observer_pattern.ca4l5;

public interface ISubJect {
    public void dangKy(IObserver observer);
    public void huyDangKy(IObserver observer);
    public void ThongBaoTinMoi(TinTuc tin);
    public void ThongBaoCapNhat(TinTuc tin);
}
