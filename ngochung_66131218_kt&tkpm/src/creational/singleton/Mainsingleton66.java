package creational.singleton;

public class Mainsingleton66 {
    public static void main(String[] args){
        Singleton66 s1 = Singleton66.getInstance();
        Singleton66 s2 = Singleton66.getInstance();
        s1.myPrint();
        s2.myPrint();
        s1.myPrint();
        s1.myPrint();
        s2.myPrint();
        s1.myPrint();

    }
}
