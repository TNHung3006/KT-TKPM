package statepattern.remote_tv;

public class OffState implements IRemoteState{
    @Override
    public void handle(RemoteControl remote) {
        remote.setState(new OnState());
        System.out.println("TV dang mo");
    }
}
