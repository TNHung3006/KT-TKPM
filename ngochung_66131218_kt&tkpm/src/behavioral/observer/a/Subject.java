package behavioral.observer.a;

public interface Subject {
    void attach (Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
