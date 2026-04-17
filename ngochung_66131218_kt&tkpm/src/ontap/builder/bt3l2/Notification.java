package ontap.builder.bt3l2;

public class Notification {
    private String tieuDe, noiDung, bieuTuong, amThanh, doUuTien;
    private String nutHanhDong;

    public Notification(String tieuDe, String noiDung, String bieuTuong, String amThanh, String doUuTien, String nutHanhDong) {
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.bieuTuong = bieuTuong;
        this.amThanh = amThanh;
        this.doUuTien = doUuTien;
        this.nutHanhDong = nutHanhDong;
    }

    public void Show(){
        System.out.println("Thong Bao");
        System.out.println("Tieu De: " + tieuDe);
        System.out.println("Noi Dung: " + noiDung);
        System.out.println("Bieu Tuong: " + bieuTuong);
        System.out.println("Am Thanh: " + amThanh);
        System.out.println("Do Uu Tien: " + doUuTien);
        System.out.println("Nut hanh dong: " + nutHanhDong);
    }
}
