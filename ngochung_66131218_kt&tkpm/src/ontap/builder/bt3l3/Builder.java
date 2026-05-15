package ontap.builder.bt3l3;

public abstract class Builder {
    String title, message, icon, sound, priority, actionButtons;

    public abstract Builder BuildTitle(String title);
    public abstract Builder BuildMessage(String message);
    public abstract Builder BuildIcon(String icon);
    public abstract Builder BuildSound(String sound);
    public abstract Builder BuildPriority(String priority);
    public abstract Builder BuildActionButtons(String actionButtons);
    public abstract Notification getResult();
}
