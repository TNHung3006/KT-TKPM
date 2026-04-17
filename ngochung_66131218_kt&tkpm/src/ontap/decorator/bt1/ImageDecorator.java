package ontap.decorator.bt1;

public class ImageDecorator implements Image{
    protected Image component;

    public ImageDecorator(Image component) {
        this.component = component;
    }

    @Override
    public void Show() {
        if(component != null){
            component.Show();
        }
    }


}
