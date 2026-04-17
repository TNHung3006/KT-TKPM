package statepattern.remote_tv;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        System.out.println("TV dang tat");
        remote.powerPress();
        remote.powerPress();
        remote.powerPress();
        remote.powerPress();
    }
}
