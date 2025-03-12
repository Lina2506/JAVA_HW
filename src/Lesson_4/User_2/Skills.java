package Lesson_4.User_2;

public class Skills {
    private String title;
    private int exp;

    public Skills() {}

    public Skills(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
