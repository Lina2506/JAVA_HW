package Lesson_1.Book;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("BBb",123, "drama"));
        books.add(new Book("dsnckjdn",369, "drama"));
        books.add(new Book("wsdwd",736, "drama"));
        books.add(new Book("wee",12, "drama"));
        books.add(new Book("wefe",344, "drama"));

    for (Book book : books) {
        System.out.println(book);
        }
    }

}