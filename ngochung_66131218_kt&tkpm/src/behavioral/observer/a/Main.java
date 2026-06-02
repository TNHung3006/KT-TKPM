package behavioral.observer.a;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel techChannel = new YoutubeChannel();

        Subscriber sinhVienA = new Subscriber("Sinh vien A");
        Subscriber sinhVienB = new Subscriber("Sinh vien B");

        techChannel.attach(sinhVienA);
        techChannel.attach(sinhVienB);

        techChannel.uploadVideo("Design Pattern in 30 minutes");
    }
}
