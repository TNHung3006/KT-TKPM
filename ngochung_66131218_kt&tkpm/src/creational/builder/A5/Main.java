package creational.builder.A5;

public class Main {
    public static void main(String[] args) {
        Book book = new BookBuilder()
                .setTitle("Sach day lap trinh")
                .setAuThor("Hungtn")
                .setPageCount(107)
                .addChapters("chuong 1: a")
                .addChapters("chuong 2: b")
                .build();
        Book book1 = new BookBuilder()
                .setTitle("Sach day hoc")
                .setAuThor("Hungtn")
                .setPageCount(170)
                .addChapters("chuong 1: co ban")
                .addChapters("chuong 2: nang cao")
                .build();
        System.out.println(book.toString());
        System.out.println(book1.toString());
    }
}
