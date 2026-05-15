package ontap.singleton.bt4;

public class LogItem{
    private String thoigian, noidung, programID;

    public LogItem(String thoigian, String noidung, String programID) {
        this.thoigian = thoigian;
        this.noidung = noidung;
        this.programID = programID;
    }

    @Override
    public String toString() {
        return "[" + thoigian + "] - " + programID + ": " + noidung;
    }
}
