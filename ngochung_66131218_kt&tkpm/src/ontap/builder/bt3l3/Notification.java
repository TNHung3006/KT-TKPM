package ontap.builder.bt3l3;

public class Notification {
    String title, message, icon, sound, priority, actionButtons;

    public Notification(String title, String message, String icon, String sound, String priority, String actionButtons) {
        this.title = title;
        this.message = message;
        this.icon = icon;
        this.sound = sound;
        this.priority = priority;
        this.actionButtons = actionButtons;
    }

    public void Show(){
        System.out.println("Hien Thi Thong Bao");
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
        System.out.println("Icon: " + icon);
        System.out.println("Sound: " + sound);
        System.out.println("Priority" + priority);
        System.out.println("Action Button: " + actionButtons);
    }
}
