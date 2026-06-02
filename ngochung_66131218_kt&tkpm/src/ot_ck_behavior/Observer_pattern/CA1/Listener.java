package ot_ck_behavior.Observer_pattern.CA1;

public interface Listener<T> {
    // Hàm này tự động kích hoạt khi có sự kiện/dữ liệu mới đổ về
    void onEvent(T t);
}