package ot_ck_behavior.Observer_pattern.CA1;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    private List<Listener<T>> listeners = new ArrayList<>();

    // Đăng ký một client lắng nghe
    public void addListener(Listener<T> l) {
        listeners.add(l);
    }

    // Thêm một sự kiện dữ liệu vào luồng phát
    public void addEvent(T t) {
        // Phát sóng dữ liệu mới cho tất cả các listener đang lắng nghe
        for (Listener<T> listener : listeners) {
            listener.onEvent(t);
        }
    }
}