package ontap.builder.bt3;

public abstract class Builder {
    String title, message, icon, sound, priority;
    String actionButtons;

    public abstract Builder buildTitle(String title);
    public abstract Builder buildMessage(String message);
    public abstract Builder buildIcon(String icon);
    public abstract Builder buildSound(String sound);
    public abstract Builder buildPriority(String priority);
    public abstract Builder buildActionButtons(String actionButtons);

    public abstract Notification getResult();

}
