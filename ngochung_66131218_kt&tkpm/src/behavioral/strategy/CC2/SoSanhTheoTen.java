package behavioral.strategy.CC2;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        int kq = o1.getHoTen().compareTo(o2.getHoTen());
        if(kq > 0) return 1;
        if(kq < 0) return -1;
        return 0;

    }
}
