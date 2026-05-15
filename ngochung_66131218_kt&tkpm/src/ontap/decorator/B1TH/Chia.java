package ontap.decorator.B1TH;

public class Chia extends BieuThucDecorator{
    private float toanHang;


    public Chia(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        if(toanHang == 0) System.out.println("mau = 0, khong hop le");
        return super.giaTri() / toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" +super.bieuThuc() + "/" + toanHang + ")";
    }
}
