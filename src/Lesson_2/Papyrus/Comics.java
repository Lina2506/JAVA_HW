package Lesson_2.Papyrus;

public class Comics extends Book {
    private String designer;

    public Comics(int pages, String title, String author, String genre, String designer) {
        super(pages, title, author, genre);
        this.designer = designer;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }
}
