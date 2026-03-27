package creational.builder.B1;

public class BieuThucDecorator extends BieuThuc{
    protected BieuThuc bieuThuc; //mui tên chứa

    public BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc();
    }
}
