package creational.singleton.A4;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Bat Dau Bau Cu--");
        User u1 = new User("anh a");
        User u2 = new User("chi b");
        User u3 = new User("chi c");

        u1.vote("Trump");
        u2.vote("Biden");
        u1.vote("Biden");
        u3.vote("Clinton");
        u3.vote("Trump");
        Election.getInstance().printResult();
    }
}
