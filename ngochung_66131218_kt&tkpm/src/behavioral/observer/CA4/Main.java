package behavioral.observer.CA4;

public class Main {
    public static void main(String[] args) {
        Topic techTopic = new Topic();

        ThanhVienA a1 = new ThanhVienA("Thanh vien A1");
        ThanhVienB b1 = new ThanhVienB("Thanh vien B1");

        techTopic.dangKy(a1);
        techTopic.dangKy(b1);
        techTopic.taoTinMoi("Java co gi moi!");
        techTopic.taoTinMoi("Spring Boot co gi moi!");
        techTopic.capNhatTin(1, "JAVA 21 RA MAT!");
    }
}
