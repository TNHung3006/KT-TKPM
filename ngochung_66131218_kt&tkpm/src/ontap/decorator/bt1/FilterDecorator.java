package ontap.decorator.bt1;

public class FilterDecorator extends ImageDecorator{
    public FilterDecorator(Image component) {
        super(component);
    }

    @Override
    public void Show() {
        super.Show();
        AddFilter();
    }

    public void AddFilter(){
        System.out.println("da them filter");
    }
}
