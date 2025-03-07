package Lesson_2.Papyrus;

public class Book extends Papyrus{
    private String genre;


    public Book(int pages, String title, String author, String genre) {
        super(pages, title, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
