package ot_ck_behavior.Observer_pattern.ca4l5;

public class TinTuc {
    private int id;
    private String noiDung;

    public TinTuc(int id, String noiDung) {
        this.id = id;
        this.noiDung = noiDung;
    }

    public int getId() {
        return id;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
    public TinTuc copy(){
        return new TinTuc(this.id, this.noiDung);
    }
}
