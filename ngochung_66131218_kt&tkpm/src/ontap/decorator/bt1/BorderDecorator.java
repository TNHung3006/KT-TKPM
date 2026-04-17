package ontap.decorator.bt1;

public class BorderDecorator extends ImageDecorator{
    public BorderDecorator(Image component) {
        super(component);
    }

    @Override
    public void Show() {
        super.Show();
        AddBorder();
    }

    public void AddBorder(){
        System.out.println("da them khung vien cho anh");
    }

}
