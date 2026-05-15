package ontap.singleton.bt4l2;

public class Program extends Logger {
    private String programID;

    public Program(String programID) {
        this.programID = programID;
    }

    public void WriteLog(String thoigian, String noidung){
        LogItem item = new LogItem(thoigian, noidung, this.programID);

        getInstance().writelog(item);
    }
}
