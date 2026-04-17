package ontap.composite.bt2;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Menu {
    // Hiện thực hóa quan hệ Menu <--o Combo : menu trong sơ đồ
    private List<Menu> children = new ArrayList<>();

    public Combo(String ten) {
        super(ten, 0); // Giá combo khởi tạo là 0, sẽ tính dựa trên các con
    }

    @Override
    public void ShowInfo() {
        System.out.println("== COMBO: " + ten + " ==");
        for (Menu child : children) {
            child.ShowInfo(); // Gọi đệ quy
        }
        System.out.println("=> Tổng giá combo [" + ten + "]: " + getGia() + " VNĐ\n");
    }

    @Override
    public double getGia() {
        double tongGia = 0;
        for (Menu child : children) {
            tongGia += child.getGia(); // Cộng dồn giá các thành phần con
        }
        return tongGia;
    }

    @Override
    public void Add(Menu n) {
        children.add(n);
    }

    @Override
    public void Remove(Menu n) {
        children.remove(n);
    }
}