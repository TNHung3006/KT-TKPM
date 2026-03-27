package creational.factory.pizza;

public abstract class Pizza {
    StringBuilder builder = new StringBuilder();
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract  void box();


    @Override //alt insert -> override method
    public String toString(){
        return builder.toString();
    }
    //alt insert
    public StringBuilder getBuilder(){
        return builder;
    }
}
