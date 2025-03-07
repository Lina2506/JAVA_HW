package Lesson_2.Papyrus;

public class Journal extends Book {
    private int year;
    private int issueNumber;

    public Journal(int pages, String title, String author, String genre, int year, int issueNumber) {
        super(pages, title, author, genre);
        this.year = year;
        this.issueNumber = issueNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}
