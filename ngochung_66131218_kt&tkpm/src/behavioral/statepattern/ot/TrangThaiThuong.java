package behavioral.statepattern.ot;

public class TrangThaiThuong implements  ITrangThai{
    private final  double CUOC_GIAY = 1800/60;

    @Override
    public void napTien(ThueBao context, double soTien) {
        context.setSoDu(context.getSoDu() + soTien);
        System.out.println("Nap thanh cong " + soTien + " VND. KHONG CO KHUYEN MAI");
    }

    @Override
    public void thucHienCuocGoi(ThueBao context, int soGiay) {
        double chiPhi = soGiay * CUOC_GIAY;
        if(context.getSoDu() >= chiPhi){
            context.setSoDu(context.getSoDu() - chiPhi);
            System.out.println("Goi " + soGiay + "S. Tru" + chiPhi + "VND. (Cuoc 1800/p)");
        }else {
            System.out.println("Canh bao: khong du so du!!!");
        }

    }

    @Override
    public void inThongTin(ThueBao context) {
        System.out.println("THONG TIN THUE BAO:");
        System.out.println("Trang Thai: Thuong");
        System.out.println("So du hien tai: " + context.getSoDu());
        int giayToiDa = (int)(context.getSoDu() / CUOC_GIAY);
        System.out.println("Thoi gian goi toi da: " + giayToiDa/60 + " phut " + giayToiDa%60 + " giay.");
    }
}
