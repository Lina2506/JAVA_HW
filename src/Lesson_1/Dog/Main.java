package Lesson_1.Dog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Monica", 3, "Mops"));
        dogs.add(new Dog("Bob", 4, "Buldog"));
        dogs.add(new Dog("Buggy", 5, "Poodel"));
        dogs.add(new Dog("Paul", 6, "Taksa"));
        dogs.add(new Dog("Iris", 7, "York"));

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
