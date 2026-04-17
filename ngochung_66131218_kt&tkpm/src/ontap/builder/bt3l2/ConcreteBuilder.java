package ontap.builder.bt3l2;

public class ConcreteBuilder extends Builder{

    @Override
    public Builder BuildTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
        return this;
    }

    @Override
    public Builder BuildNoiDung(String noiDung) {
        this.noiDung = noiDung;
        return this;
    }

    @Override
    public Builder BuildBieuTuong(String bieuTuong) {
        this.bieuTuong = bieuTuong;
        return this;
    }

    @Override
    public Builder BuildAmThanh(String amThanh) {
        this.amThanh = amThanh;
        return this;
    }

    @Override
    public Builder BuildDoUuTien(String doUuTien) {
        this.doUuTien = doUuTien;
        return this;
    }

    @Override
    public Builder BuildNutHanhDong(String nutHanhDong) {
        this.nutHanhDong = nutHanhDong;
        return this;
    }

    @Override
    public Notification getResult() {
        return new Notification(tieuDe,noiDung,bieuTuong,amThanh,doUuTien,nutHanhDong);
    }
}
