package creational.builder.A5;

import java.util.List;

public class Book {
    private String title, author;
    private int pages;
    List<String> chapters;

    public Book(String title, String author, int pages, List<String> chapters) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--THONG TIN SACH--").append("\n");
        sb.append("Tua de: ").append(title).append("\n");
        sb.append("Tac gia: ").append(author).append("\n");
        sb.append("So Trang: ").append(pages).append("\n");
        sb.append("--Muc Luc--").append("\n");
        for(int i = 0; i < chapters.size(); i++){
            sb.append((i+1)+ ". " + chapters.get(i)).append("\n");
        }
        return sb.toString();
    }
}
