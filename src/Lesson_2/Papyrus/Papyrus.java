package Lesson_2.Papyrus;

public class Papyrus {
    private int pages;
    private String title;
    private String author;

    public Papyrus() {}

    public Papyrus(int pages, String title, String author) {
        this.pages = pages;
        this.title = title;
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
