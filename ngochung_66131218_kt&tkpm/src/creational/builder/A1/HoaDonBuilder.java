package creational.builder.A1;

import java.util.ArrayList;
import java.util.List;

public class HoaDonBuilder {
    private  HoaDonHeader currentHeader;
    private List<CTHD> currentList = new ArrayList<>();
    public HoaDonBuilder setHeader(String ma, String ngay, String ten){
        this.currentHeader = new HoaDonHeader(ma, ngay, ten);
        return this;
    }
    public HoaDonBuilder addChiTiet(String sp, int sl, double gia, double ck){
        this.currentList.add(new CTHD(sp, sl, gia, ck));
        return this;
    }
    public HoaDon build(){
        return new HoaDon(currentHeader,currentList);
    }
}
