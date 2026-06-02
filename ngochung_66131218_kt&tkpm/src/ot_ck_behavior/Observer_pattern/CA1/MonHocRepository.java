package ot_ck_behavior.Observer_pattern.CA1;

import java.util.ArrayList;
import java.util.List;

public class MonHocRepository {
    private List<MonHoc> database = new ArrayList<>();
    private MyStream<List<MonHoc>> stream;

    public MonHocRepository(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    // Hàm Thêm dữ liệu
    public void themMonHoc(MonHoc mh) {
        database.add(mh);
        notifyDataChanged();
    }

    // Hàm Xóa dữ liệu theo mã môn học
    public void xoaMonHoc(String maMH) {
        database.removeIf(mh -> mh.getMaMH().equals(maMH));
        notifyDataChanged();
    }

    // Hàm Cập nhật tên môn học
    public void capNhatMonHoc(String maMH, String tenMoi) {
        for (MonHoc mh : database) {
            if (mh.getMaMH().equals(maMH)) {
                mh.setTenMH(tenMoi);
                break;
            }
        }
        notifyDataChanged();
    }

    // Mẹo nhỏ: Đóng gói hành động tự động đẩy dữ liệu mới vào luồng stream
    private void notifyDataChanged() {
        // Tạo một bản sao danh sách hiện tại để đẩy đi, đảm bảo an toàn dữ liệu
        List<MonHoc> cloneList = new ArrayList<>(database);
        stream.addEvent(cloneList);
    }
}