package ot_ck_behavior.Observer_pattern.C4L3;

public class Tin {
    private int id;
    private String noiDung;

    public Tin(int id, String noiDung) {
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
    public Tin copy(){
        return new Tin(this.id, this.noiDung);
    }
}
