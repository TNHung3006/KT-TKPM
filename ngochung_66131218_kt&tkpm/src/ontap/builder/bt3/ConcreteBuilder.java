package ontap.builder.bt3;

class ConcreteBuilder extends Builder {

    @Override
    public Builder buildTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public Builder buildMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public Builder buildIcon(String icon) {
        this.icon = icon;
        return this;
    }

    @Override
    public Builder buildSound(String sound) {
        this.sound = sound;
        return this;
    }

    @Override
    public Builder buildPriority(String priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public Builder buildActionButtons(String actionButtons) {
        this.actionButtons = actionButtons;
        return this;
    }

    @Override
    public Notification getResult() {
        return new Notification(title, message, icon, sound, priority, actionButtons);
    }
}
