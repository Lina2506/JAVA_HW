package Lesson_3.Printable;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }
    @Override
    public void print() {
        System.out.println(title);
   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
