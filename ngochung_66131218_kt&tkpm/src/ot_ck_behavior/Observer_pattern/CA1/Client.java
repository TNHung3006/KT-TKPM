package ot_ck_behavior.Observer_pattern.CA1;

import java.util.List;

public class Client implements Listener<List<MonHoc>> {
    private String tenClient;

    public Client(String tenClient) {
        this.tenClient = tenClient;
    }

    @Override
    public void onEvent(List<MonHoc> danhSach) {
        System.out.println("\n--- [Giao diện " + tenClient + "] CẬP NHẬT TỰ ĐỘNG ĐẾN MÀN HÌNH ---");
        if (danhSach.isEmpty()) {
            System.out.println("(Danh sách trống)");
        } else {
            for (MonHoc mh : danhSach) {
                System.out.println(mh);
            }
        }
    }
}