package creational.builder.A5;

import java.util.ArrayList;
import java.util.List;

public class BookBuilder {
    private String title, author;
    private int pages;
    List<String> chapters = new ArrayList<>();

    public BookBuilder setTitle(String t){
        this.title = t;
        return this;
    }
    public BookBuilder setAuThor(String a) {
        this.author = a;
        return this;
    }
    public BookBuilder setPageCount(int p){
        this.pages = p;
        return this;
    }
    public BookBuilder addChapters(String c){
        this.chapters.add(c);
        return this;
    }
    public Book build(){
        return new Book(title, author, pages, chapters);
    }
}
