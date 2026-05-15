package ontap.singleton.bt4;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private List<LogItem> logs;
    protected Logger(){
        logs = new ArrayList<>();
    }
    public static Logger getInstance(){
        if(instance == null) instance = new Logger();
        return instance;
    }
    public void writeLog(LogItem log){
        logs.add(log);
    }

    public void viewlog(){
        System.out.println("==NHAT KY HE THONG==");
        for(LogItem item : logs){
            System.out.println(item.toString());
        }
    }
}
