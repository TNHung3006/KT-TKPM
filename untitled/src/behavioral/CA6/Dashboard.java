package behavioral.CA6;

public class Dashboard implements Observer{
    private int thoiGian, countdown, grade;

    @Override
    public void update(int thoiGian, int countdown, int grade) {
        this.thoiGian = thoiGian;
        this.countdown = countdown;
        this.grade = grade;
        display();
    }
    public void display() {
        System.out.println("--Dashboard--");
        System.out.println("--Thoi gian con lai: " + thoiGian);
        System.out.println("--So luot choi: " + countdown);
        System.out.println("--Diem so: " + grade);
        System.out.println("---------------------");
    }
}
