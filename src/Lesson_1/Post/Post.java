package Lesson_1.Post;

public class Post {
    private int UserId;
    private int id;
    private String title;
    private String body;

    public Post() {}

    public Post(int userId, int id, String title, String body) {
        UserId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "UserId=" + UserId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
