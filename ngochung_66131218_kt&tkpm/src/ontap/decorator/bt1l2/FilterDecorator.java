package ontap.decorator.bt1l2;

public class FilterDecorator extends ImageDecorator{
    public FilterDecorator(Image image) {
        super(image);
    }

    public void AddFilter(){
        System.out.println("Da them filter");
    }

    @Override
    public void Show() {
        super.Show();
        AddFilter();
    }
}
