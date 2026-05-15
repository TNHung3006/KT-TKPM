package behavioral.strategy.CC1;

public class Context {
    private Tinh tinhToan;
    public void setTinhToan(Tinh tinhToan){
        this.tinhToan = tinhToan;
    }
    public float tinh(float a, float b){
        if(this.tinhToan == null){
            throw new IllegalStateException("chua thiet lap phep tinh (Strategy)!");
        }
        return this.tinhToan.tinh(a, b);
    }
}
