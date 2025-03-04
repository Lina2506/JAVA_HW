package Lesson_1.Comment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Comment> comments = new ArrayList<>();

        comments.add(new Comment(1,1,"id labore ex et quam laborum","Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo " +
                        "necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comment(2,2,"id labore ex et quam laborum","Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo " +
                        "necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comment(3,3,"id labore ex et quam laborum","Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo " +
                        "necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comment(4,4,"id labore ex et quam laborum","Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo " +
                        "necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comment(4,5,"id labore ex et quam laborum","Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo " +
                        "necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"));

        for (Comment comment : comments) {
            System.out.println(comment);
        }
    }
}
