package Lesson_3;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }
    @Override
    public void print(){
        System.out.println(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
