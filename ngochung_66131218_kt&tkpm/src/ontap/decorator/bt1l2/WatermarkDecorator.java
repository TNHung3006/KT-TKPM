package ontap.decorator.bt1l2;

public class WatermarkDecorator extends ImageDecorator{
    public WatermarkDecorator(Image image) {
        super(image);
    }

    public void AddWatermark(){
        System.out.println(" da chen watermark");
    }

    @Override
    public void Show() {
        super.Show();
        AddWatermark();
    }
}
