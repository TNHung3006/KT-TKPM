package creational.singleton.A4;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void vote(String candidate){
        Election system = Election.getInstance();
        system.submitVote(candidate, this.name);
    }
}
