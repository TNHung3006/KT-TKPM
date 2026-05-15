package ontap.builder.bt3l3;

public class ConcreteBuilder extends Builder{

    @Override
    public Builder BuildTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public Builder BuildMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public Builder BuildIcon(String icon) {
        this.icon = icon;
        return this;
    }

    @Override
    public Builder BuildSound(String sound) {
        this.sound = sound;
        return this;
    }

    @Override
    public Builder BuildPriority(String priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public Builder BuildActionButtons(String actionButtons) {
        this.actionButtons = actionButtons;
        return this;
    }

    @Override
    public Notification getResult() {
        return new Notification(title,message,icon,sound,priority,actionButtons);
    }
}
