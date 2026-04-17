package ontap.builder.bt3;

public class Main {
    public static void main(String[] args) {
        Notification fullnoti = new ConcreteBuilder().buildTitle("Canh bao bao mat")
                .buildMessage("phat hien dang nhap la tu nha trang")
                .buildIcon("security_shield.png")
                .buildSound("SonTung-MTP")
                .buildPriority("Khan cap")
                .buildActionButtons("la toi, khong phai toi")
                .getResult();

        System.out.println("vd 1: thong bao day du cac thanh phan");
        fullnoti.Show();

        System.out.println("vd 2: thong bao ngan gon");
        Notification fullnoti1 = new ConcreteBuilder().buildTitle("Canh bao bao mat")
                .buildMessage("phat hien dang nhap la tu nha trang")
                .buildSound("SonTung-MTP")
                .buildActionButtons("la toi, khong phai toi")
                .getResult();
        fullnoti1.Show();
    }
}
