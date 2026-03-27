package creational.singleton;

public class Singleton66 {
    private static Singleton66 instane;
    int count = 0;
    private Singleton66(){
    }
    public static Singleton66 getInstance(){
        if( instane == null)
            instane = new Singleton66();
        return instane;
    }
    public void myPrint(){
        System.out.println(++count);
    }
}
