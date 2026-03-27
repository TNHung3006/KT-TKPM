package creational.builder.B1;

public class BieuThucDonGian extends BieuThuc {
    private float toanHang;

    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return toanHang;
    }

    @Override
    public String bieuThuc() {
        return String.valueOf(toanHang);
    }
}
