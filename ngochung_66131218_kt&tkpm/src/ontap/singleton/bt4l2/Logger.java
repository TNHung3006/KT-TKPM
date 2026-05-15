package ontap.singleton.bt4l2;

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

    public void writelog(LogItem log){
        logs.add(log);
    }

    public void showlog(){
        System.out.println("==Hien Thi==");
        for(LogItem item : logs){
            System.out.println(item.toString());
        }
    }

}
