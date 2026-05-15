package ontap.singleton.bt4;

public class Program extends Logger{
    String programID;

    public Program(String programID) {
        this.programID = programID;
    }

    public void WriteLog(String noidung, String thoigian){
        LogItem item = new LogItem(thoigian, noidung, this.programID);

        getInstance().writeLog(item);
    }

}
