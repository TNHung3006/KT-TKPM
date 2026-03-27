package creational.builder.B1;

public class Chia extends BieuThucDecorator{
    private float toanHang;

    public Chia(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        if(toanHang == 0){
            throw new ArithmeticException("khong the chia cho 0");
        }
        return super.giaTri() / toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + super.bieuThuc() + " / " + toanHang + ")";
    }
}
