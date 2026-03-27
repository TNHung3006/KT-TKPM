package creational.builder.A1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader header;
    private List<CTHD> list;

    public HoaDon(HoaDonHeader header, List<CTHD> list) {
        this.header = header;
        this.list = list;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "header=" + header +
                ", list=" + list +
                '}';
    }
}
