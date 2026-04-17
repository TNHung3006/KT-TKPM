package ontap.singleton;

public class Logger {
    private static Logger instance;
    protected Logger(){}
    public static Logger Instance(){
        if(instance == null) instance = new Logger();
        return instance;
    }
}
