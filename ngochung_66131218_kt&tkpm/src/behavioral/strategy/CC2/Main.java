package behavioral.strategy.CC2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //su dung kieu du lieu date thi nen them thu vien nay
        QLSV qlsv = new QLSV();
        qlsv.themSV(new SinhVien("Ngo A", sdf.parse("14/05/2005"),8.8f));
        qlsv.themSV(new SinhVien("Ngo C", sdf.parse("16/07/2005"),6.3f));
        qlsv.themSV(new SinhVien("Ngo B", sdf.parse("22/02/2005"),7.5f));

        System.out.println("---DANH SACH BAN DAU---");
        qlsv.inDS();
        //1. Sap xep theo ten
        System.out.println("---SAP XEP THEO TEN (A-Z)---");
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();
        //2. Sap xep theo diem
        System.out.println("---SAP XEP THEO DIEM (Tang Dan)---");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();

    }
}
