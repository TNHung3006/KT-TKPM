package behavioral.observer.a;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("Xin chao " + name + ", Video moi" + videoTitle + "da co tren kenh!!");
    }
}
