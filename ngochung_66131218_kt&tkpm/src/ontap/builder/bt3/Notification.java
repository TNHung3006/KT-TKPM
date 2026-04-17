package ontap.builder.bt3;

public class Notification {
    private String title, message, icon, sound, priority;
    private String actionButtons;

    public Notification(String title, String message, String icon, String sound, String priority, String actionButtons) {
        this.title = title;
        this.message = message;
        this.icon = icon;
        this.sound = sound;
        this.priority = priority;
        this.actionButtons = actionButtons;
    }

    public void Show(){
        System.out.println("THONG BAO!!!!");
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
        System.out.println("Bieu tuong: " + icon);
        System.out.println("Am thanh: " + sound);
        System.out.println("Do uu tien: " + priority);
        System.out.println("Nut hanh dong: " + (actionButtons != null ? actionButtons : "khong co!"));
    }
}
