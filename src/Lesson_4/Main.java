package Lesson_4;

import Lesson_4.User.Users;
import Lesson_4.User_2.Car;
import Lesson_4.User_2.Gender;
import Lesson_4.User_2.Skills;
import Lesson_4.User_2.User;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Users> users = new ArrayList<>();
        users.add(new Users(1,"Vasia", 30));
        users.add(new Users(2,"Olya", 15));
        users.add(new Users(3,"Oz", 10));
        users.add(new Users(4,"Valentina", 50));
        users.add(new Users(5,"Max", 75));

        //Сортування за віком:
        users.sort(Comparator.comparingInt(Users::getAge));
        System.out.println("Сортування за віком в порядку зростання: " + users);
        users.sort(Comparator.comparingInt(Users::getAge).reversed());
        System.out.println("Сортування за віком в порядку спадання: " + users);

        //Сортування за кількістю знаків в імені:
        users.sort(Comparator.comparingInt(Users -> Users.getName().length()));
        System.out.println("Cортування за довжиною імені за зростанням: " + users);
        users.sort(Comparator.comparingInt(Users -> -(Users.getName().length())));  ;
        System.out.println("Cортування за довжиною імені за спаданням: " + users);


        //ArrayList на 15 елементів___________________________________________//
        ArrayList<String> words = new ArrayList<>(Arrays.asList("jeans","egg","car","ocean","dog","bus","gap","lama","icon","apple",
                "kiwi","hi","music","nike","fly"));
        Collections.sort(words);
        System.out.println(words);

        //HashSet_USER___________________________________________________
        Set<User>userSet = new HashSet<>();
        userSet.add(new User(1,"vasya","pupkin","asd@asd.com",31, Gender.MALE, Arrays.asList(new Skills("Java",1)), null));
        userSet.add(new User(2,"kolya","pupkin","asd@asd.com",31, Gender.MALE, Arrays.asList(new Skills("QA",2),
                new Skills("html",1),new Skills("pyton",1),new Skills("css",4),new Skills("JS",3)), null));
        userSet.add(new User(3,"ola","pupkin","asd@asd.com",31, Gender.FEMALE, Arrays.asList(new Skills("css",4),new Skills("JS",3)), null));
        userSet.add(new User(4,"petya","pupkin","asd@asd.com",31, Gender.MALE, Arrays.asList(new Skills("js",1),
                new Skills("java",2)), null));
        userSet.add(new User(5,"misha","pupkin","asd@asd.com",31, Gender.MALE, Arrays.asList(new Skills("QA",2),
                new Skills("html",1),new Skills("pyton",1)), null));
        userSet.add(new User(6,"lena","pupkin","asd@asd.com",31, Gender.FEMALE, Arrays.asList(new Skills("QA",2)), null));
        userSet.add(new User(7,"kiril","pupkin","asd@asd.com",31, Gender.MALE, Arrays.asList(new Skills("Java",1)), null));
        userSet.add(new User(8,"zhenya","pupkin","asd@asd.com",31, Gender.MALE, Arrays.asList(new Skills("pyton",1),new Skills("css",4),new Skills("JS",3)), null));
        userSet.add(new User(9,"tanya","pupkin","asd@asd.com",31, Gender.FEMALE, Arrays.asList(new Skills("QA",2),
                new Skills("html",1),new Skills("pyton",1),new Skills("css",4)), null));
        userSet.add(new User(10,"sveta","pupkin","asd@asd.com",31, Gender.FEMALE, Arrays.asList(new Skills("html",1),new Skills("pyton",1)), null));
        //_______видалення чоловіків______________________________________

        Iterator<User>iterator = userSet.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();
            if (user.getGender() == Gender.MALE){
                iterator.remove();
            }
        }
        //userSet.removeIf(user -> user.getGender() == Gender.MALE); - теж працює!
        System.out.println("HashSet без чоловіків"+userSet);

        //TreeSet User______________________________________________________
        TreeSet<User>treeSet = new TreeSet<>(Comparator.comparingInt(user -> user.getSkills().size()));
       treeSet.add(new User(1,"vasya","pupkin","asd@asd.com",31, Gender.MALE, Arrays.asList(new Skills("Java",1)), null));
        treeSet.add(new User(2,"kolya","pupkin","asd@asd.com",31, Gender.MALE, Arrays.asList(new Skills("QA",2),
                new Skills("html",1),new Skills("pyton",1),new Skills("css",4),new Skills("JS",3)), null));
        treeSet.add(new User(3,"ola","pupkin","asd@asd.com",31, Gender.FEMALE, Arrays.asList(new Skills("css",4),new Skills("JS",3)), null));
        treeSet.add(new User(4,"petya","pupkin","asd@asd.com",31, Gender.MALE, Arrays.asList(new Skills("js",1),
                new Skills("java",2)), null));
        treeSet.add(new User(5,"misha","pupkin","asd@asd.com",31, Gender.MALE, Arrays.asList(new Skills("QA",2),
                new Skills("html",1),new Skills("pyton",1)), null));
        treeSet.add(new User(6,"lena","pupkin","asd@asd.com",31, Gender.FEMALE, Arrays.asList(new Skills("QA",2)), null));
        treeSet.add(new User(7,"kiril","pupkin","asd@asd.com",31, Gender.MALE, Arrays.asList(new Skills("Java",1)), null));
        treeSet.add(new User(8,"zhenya","pupkin","asd@asd.com",31, Gender.MALE, Arrays.asList(new Skills("pyton",1),new Skills("css",4),new Skills("JS",3)), null));
        treeSet.add(new User(9,"tanya","pupkin","asd@asd.com",31, Gender.FEMALE, Arrays.asList(new Skills("QA",2),
                new Skills("html",1),new Skills("pyton",1),new Skills("css",4)), null));
        treeSet.add(new User(10,"sveta","pupkin","asd@asd.com",31, Gender.FEMALE, Arrays.asList(new Skills("html",1),new Skills("pyton",1)), null));
        System.out.println("TreeSet"+treeSet);
    }
}
