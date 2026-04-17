package ontap.decorator.bt1;

public class WatermarkDecorator extends ImageDecorator{
    public WatermarkDecorator(Image component) {
        super(component);
    }

    public void AddWatermark(){
        System.out.println("da them watermark");
    }

    @Override
    public void Show() {
        super.Show();
        AddWatermark();
    }
}
