package behavioral.CA2;

import java.sql.SQLOutput;

public class Activity implements OnClickListener {
    private int soLanClick = 0;

    private Button myButton;

    public  Activity(){
        myButton = new Button();
        myButton.attach(this);
    }

    public  void moPhongNguoiDungBamNut(){
        myButton.click();
    }

    @Override
    public void onClick() {
        soLanClick++;
        System.out.println("Ban click lan thu" + soLanClick);
    }
}
