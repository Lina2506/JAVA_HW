package Lesson_5;

import Lesson_5.auto.Auto;
import Lesson_5.auto.Owner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //______________WORDS____________

        ArrayList<String>words = new ArrayList<>(Arrays.asList("jeans","egg","car","ocean","dog","bus","gap","lama","icon","apple",
                "kiwi","hi","music","nike","fly"));

        ArrayList<String>sortWords = words.stream()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(sortWords);

        ArrayList<String> filterWords=words.stream()
                .filter(word -> word.length()>=4)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(filterWords);

        //_________________NUMBERS_________________

        int[]numbers={34,5,67,100,9,56,67,2324,5666,675,343,6567,23,7,15,454,78,34,98,20};
        System.out.println(Arrays.toString(numbers));

        int[] sortedNumbers=Arrays.stream(numbers)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(sortedNumbers));

        ArrayList<Integer>multiply_3=Arrays.stream(numbers)
                .filter(n->n%3==0)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(multiply_3);

        ArrayList<Integer>multiply_10=Arrays.stream(numbers)
                .filter(n->n%10==0)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(multiply_10);

        Arrays.stream(numbers)
                .forEach(n->
                    System.out.println(n+""));
        System.out.println();

        int[] tripledNumbers=Arrays.stream(numbers)
                .map(n->n*3)
                .toArray();
        System.out.println(Arrays.toString(tripledNumbers));

        //____________________________________AUTO__________________________________
        ArrayList<Auto> autoList =new ArrayList<>(Arrays.asList(
                new Auto("BMW", 500, new Owner("vasya", 20, 2), 100000, 2020),
                new Auto("hundai", 100, new Owner("petya",50,20), 20000, 2020),
                new Auto("Opel", 120, new Owner("kolya",43,15),10000,2010),
                new Auto("mazda",170, new Owner("max", 26,5), 30000,2015),
                new Auto("shkoda", 110, new Owner("olya",40,10),34000,2019),
                new Auto("infinity", 338, new Owner("philipo",36,4), 70000,2024),
                new Auto("mercedes", 350, new Owner("ganc", 60,40),25000, 2017)
        ));
        autoList.stream().limit(autoList.size()/2).forEach(Auto::repair);
        System.out.println(autoList);

        autoList.stream()
                .map(auto -> auto.owner)
                .filter(owner -> owner.getExp()<5 && owner.getAge() >25)
                .forEach(Owner::exp);


        double totalCost= autoList.stream()
                .mapToDouble(auto-> auto.getPrice())
                .sum();
        System.out.println(totalCost);

        autoList.forEach(System.out::println);
    }
}
