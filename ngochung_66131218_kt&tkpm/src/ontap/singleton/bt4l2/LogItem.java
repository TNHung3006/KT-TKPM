package ontap.singleton.bt4l2;

public class LogItem {
    private String thoigian, noidung, programID;

    public LogItem(String thoigian, String noidung, String programID) {
        this.thoigian = thoigian;
        this.noidung = noidung;
        this.programID = programID;
    }

    @Override
    public String toString() {
        return "LogItem{" +
                "thoigian='" + thoigian + '\'' +
                ", noidung='" + noidung + '\'' +
                ", programID='" + programID + '\'' +
                '}';
    }
}
