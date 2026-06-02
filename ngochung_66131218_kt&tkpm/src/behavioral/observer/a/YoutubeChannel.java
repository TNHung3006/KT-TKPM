package behavioral.observer.a;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    private List<Observer> subcribers = new ArrayList<>();
    private String lastesVideo;

    @Override
    public void attach(Observer observer) {
        subcribers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        subcribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : subcribers){
            observer.update(lastesVideo);
        }
    }

    public void uploadVideo(String title){
        this.lastesVideo = title;
        System.out.println("Da upload video" + title);
        notifyObservers();
    }
}
