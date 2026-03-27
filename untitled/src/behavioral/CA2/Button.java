package behavioral.CA2;

import java.util.ArrayList;
import java.util.List;

public class Button {
    private List<OnClickListener> observers = new ArrayList<>();

    public void attach (OnClickListener observer){
        observers.add(observer);
    }

    public void click(){
        for(OnClickListener observer : observers){
            observer.onClick();
        }
    }

}
