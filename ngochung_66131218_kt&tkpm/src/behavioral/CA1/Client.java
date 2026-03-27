package behavioral.CA1;

import java.util.List;

public class Client implements Listener<List<MonHoc>> {
    @Override
    public void update(List<MonHoc> data) {
        System.out.println("[Client - UI Update] - Danh sach mon hoc: ");
        if(data.isEmpty()){
            System.out.println("--(Danh sach trong)");
        }else{
            for(MonHoc mh: data){
                System.out.println("--" + mh.toString());
            }
        }
    }
}
