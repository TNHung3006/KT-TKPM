package ontap.decorator.bt1l2;

public class ImageDecorator implements Image{
    protected Image image;

    public ImageDecorator(Image image) {
        this.image = image;
    }

    @Override
    public void Show() {
        if(image != null) image.Show();
    }
}
