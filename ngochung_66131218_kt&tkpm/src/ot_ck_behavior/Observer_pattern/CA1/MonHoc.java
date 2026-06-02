package ot_ck_behavior.Observer_pattern.CA1;

public class MonHoc {
    private String maMH;
    private String tenMH;

    public MonHoc(String maMH, String tenMH) {
        this.maMH = maMH;
        this.tenMH = tenMH;
    }

    public String getMaMH() { return maMH; }
    public String getTenMH() { return tenMH; }
    public void setTenMH(String tenMH) { this.tenMH = tenMH; }

    @Override
    public String toString() {
        return "Môn: " + maMH + " - " + tenMH;
    }
}