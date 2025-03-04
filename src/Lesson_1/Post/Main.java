package Lesson_1.Post;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Post> posts = new ArrayList<>();

        posts.add(new Post(1, 3, "sunt aut facere repellat provident occaecati excepturi" +
                " optio reprehenderit", "quia et suscipit\\nsuscipit recusandae consequuntur " +
                "expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem " +
                "sunt rem eveniet architecto"));
        posts.add(new Post(2, 7, "sunt aut facere repellat provident occaecati excepturi" +
                " optio reprehenderit", "quia et suscipit\\nsuscipit recusandae consequuntur " +
                "expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem " +
                "sunt rem eveniet architecto"));
        posts.add(new Post(3, 3, "sunt aut facere repellat provident occaecati excepturi" +
                " optio reprehenderit", "quia et suscipit\\nsuscipit recusandae consequuntur " +
                "expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem " +
                "sunt rem eveniet architecto"));
        posts.add(new Post(4, 34, "sunt aut facere repellat provident occaecati " +
                "excepturi optio reprehenderit", "quia et suscipit\\nsuscipit recusandae " +
                "consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum " +
                "rerum est autem sunt rem eveniet architecto"));
        posts.add(new Post(5, 5, "sunt aut facere repellat provident occaecati " +
                "excepturi optio reprehenderit", "quia et suscipit\\nsuscipit recusandae " +
                "consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum " +
                "rerum est autem sunt rem eveniet architecto"));

        for (Post post : posts) {
            System.out.println(post);
        }

    }
}
