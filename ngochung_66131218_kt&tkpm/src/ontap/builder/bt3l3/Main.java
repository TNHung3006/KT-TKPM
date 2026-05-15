package ontap.builder.bt3l3;

public class Main {
    public static void main(String[] args) {
        Notification thongbao = new ConcreteBuilder().BuildTitle("ABC")
                .BuildMessage("ABC")
                .BuildIcon("MAT CUOI")
                .BuildSound("AM THANH")
                .BuildPriority("THU 1")
                .BuildActionButtons("CO, KHONG")
                .getResult();
        thongbao.Show();
    }
}
