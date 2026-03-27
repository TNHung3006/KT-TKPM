package behavioral.CA6;

import java.util.ArrayList;
import java.util.List;

public class PlayerData implements Subject {
    private List<Observer> observers;
    private int thoiGian, countdown, grade;

    public PlayerData() {
        // Khởi tạo danh sách observers
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update(thoiGian, countdown, grade);
        }
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        notifyObserver();
    }

    public void setCountdown(int countdown) {
        this.countdown = countdown;
        notifyObserver();
    }

    public void setGrade(int grade) {
        this.grade = grade;
        notifyObserver();
    }

    public void setGameData(int thoiGian, int countdown, int grade) {
        this.thoiGian = thoiGian;
        this.countdown = countdown;
        this.grade = grade;
        notifyObserver(); // Báo cho các observer biết dữ liệu đã thay đổi
    }
}
