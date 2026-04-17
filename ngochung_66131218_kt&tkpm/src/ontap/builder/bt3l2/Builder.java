package ontap.builder.bt3l2;

public abstract class Builder {
    String tieuDe, noiDung, bieuTuong, amThanh, doUuTien, nutHanhDong;

    public abstract Builder BuildTieuDe(String tieuDe);
    public abstract Builder BuildNoiDung(String noiDung);
    public abstract Builder BuildBieuTuong(String bieuTuong);
    public abstract Builder BuildAmThanh(String amThanh);
    public abstract Builder BuildDoUuTien(String doUuTien);
    public abstract Builder BuildNutHanhDong(String nutHanhDong);

    public abstract  Notification getResult();
}
