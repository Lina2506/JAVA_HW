package Lesson_5;

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
    }
}
