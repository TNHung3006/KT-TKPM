package ot_ck_behavior.Observer_pattern.CA1;

import java.util.List; // CHỈ CẦN THÊM DÒNG NÀY LÀ HẾT LỖI

public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo luồng Stream truyền tải danh sách môn học
        MyStream<List<MonHoc>> monHocStream = new MyStream<>();

        // 2. Khởi tạo Client (Màn hình hiển thị) và đăng ký lắng nghe Stream
        Client manHinhChinh = new Client("Màn Hình Chính");
        monHocStream.addListener(manHinhChinh);

        // 3. Khởi tạo lớp truy cập dữ liệu và gắn Stream vào
        MonHocRepository repo = new MonHocRepository(monHocStream);

        // 4. Thử nghiệm Thêm/Cập nhật/Xóa để thấy màn hình tự động Binding dữ liệu
        System.out.println("--- Bắt đầu thao tác dữ liệu ---");

        repo.themMonHoc(new MonHoc("IT01", "Mẫu thiết kế phần mềm"));
        repo.themMonHoc(new MonHoc("IT02", "Lập trình di động với Flutter"));

        // Thử cập nhật môn học
        repo.capNhatMonHoc("IT01", "Kiến trúc và Thiết kế phần mềm");

        // Thử xóa môn học
        repo.xoaMonHoc("IT02");
    }
}