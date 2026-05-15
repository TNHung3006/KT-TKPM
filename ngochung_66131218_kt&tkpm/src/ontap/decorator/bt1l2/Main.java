package ontap.decorator.bt1l2;

public class Main {
    public static void main(String[] args) {
        Image anh = new BasicImage();

        anh = new BorderDecorator(anh);
        anh = new FilterDecorator(anh);

        anh.Show();
    }
}
