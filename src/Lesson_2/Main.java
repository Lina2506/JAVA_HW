package Lesson_2;

import Lesson_2.Person.Car;
import Lesson_2.Person.Gender;
import Lesson_2.Person.Person;
import Lesson_2.Person.Skills;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Skills> skills=new ArrayList<>();
        skills.add(new Skills("java", 10));
        skills.add(new Skills("js", 10));
        skills.add(new Skills("c++", 10));

        Car car = new Car("toyota", 2021, 250);
        Person person = new Person(1,"vasya","pupkin", "asd@asd.com", 31, Gender.MALE, skills, car);
        person.info();
    }
}
