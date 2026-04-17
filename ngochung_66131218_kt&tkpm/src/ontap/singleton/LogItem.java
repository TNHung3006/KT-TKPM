package ontap.singleton;

public class LogItem extends Logger{
    private String thoigian, noidung, programID;

    public LogItem(String thoigian, String noidung, String programID) {
        this.thoigian = thoigian;
        this.noidung = noidung;
        this.programID = programID;
    }
}
