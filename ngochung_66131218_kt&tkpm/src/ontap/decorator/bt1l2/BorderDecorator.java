package ontap.decorator.bt1l2;

public class BorderDecorator extends ImageDecorator{
    public BorderDecorator(Image image) {
        super(image);
    }

    public void AddBorder(){
        System.out.println("da them khung vien`");
    }

    @Override
    public void Show() {
        super.Show();
        AddBorder();
    }
}
