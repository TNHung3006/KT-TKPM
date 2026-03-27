package creational.singleton.sample;

public class ThuTuong {
    //1. biến static
    //static có nghĩa là instance sẽ thuộc về lop thủ tướng
    private static ThuTuong instance = new ThuTuong();
    //2. private constructor
    private ThuTuong(){}
    //3. static method
    //C1. khong khoi tao truoc instance
//    public static synchronized ThuTuong getInstance() { //synchronized là dong bo hoa khong de khoi tao bi trung, nhung lam cham chuong trinh
//        // đây là cách có thể láy được ong instance,
//        // các phương thức ngoài có thể giao tiếp qua phương thức này
//        if(instance == null){   // này là khoi tạo muộn
//            instance = new ThuTuong();
//        }
//        return instance;
//    }
    //C2 da khoi tao 1 new ThuTuong() nen dung cach nay
    public static ThuTuong getInstance(){
        return instance;
    }
}
