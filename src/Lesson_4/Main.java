package Lesson_4;

import Lesson_4.User.User;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"Vasia", 30));
        users.add(new User(2,"Olya", 15));
        users.add(new User(3,"Oz", 10));
        users.add(new User(4,"Valentina", 50));
        users.add(new User(5,"Max", 75));

        //Сортування за віком:
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println("Сортування за віком в порядку зростання: " + users);
        users.sort(Comparator.comparingInt(User::getAge).reversed());
        System.out.println("Сортування за віком в порядку спадання: " + users);

        //Сортування за кількістю знаків в імені:
        users.sort(Comparator.comparingInt(User->User.getName().length()));
        System.out.println("Cортування за довжиною імені за зростанням: " + users);
        users.sort(Comparator.comparingInt(User-> -(User.getName().length())));  ;
        System.out.println("Cортування за довжиною імені за спаданням: " + users);


        //ArrayList на 15 елементів___________________________________________//
        ArrayList<String> words = new ArrayList<>(Arrays.asList("jeans","egg","car","ocean","dog","bus","gap","lama","icon","apple",
                "kiwi","hi","music","nike","fly"));
        Collections.sort(words);
        System.out.println(words);
    }
}
