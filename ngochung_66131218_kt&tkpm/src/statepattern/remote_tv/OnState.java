package statepattern.remote_tv;

public class OnState implements IRemoteState {
    @Override
    public void handle(RemoteControl remote) {
        remote.setState(new OffState());
        System.out.println("TV dang tat");
    }
}
