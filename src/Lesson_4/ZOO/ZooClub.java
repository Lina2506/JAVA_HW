package Lesson_4.ZOO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private Map<Person, List<Pet>> club =new HashMap<>();

    public void addPerson(Person person) {
        club.put(person, new ArrayList<>());
    }
    public void addPet(Person person,Pet pet) {
        club.get(person).add(pet);
    }
    public void removePet(Person person,Pet pet) {
        club.get(person).remove(pet);
    }
    public void removePerson(Person person) {
        club.remove(person);
    }
    public void removePetFromAll(Pet pet) {
        for (List<Pet> pets : club.values()) {
            pets.remove(pet);
        }
    }
    public void printClub() {
        System.out.println(club);
        club.forEach((k,v)-> System.out.println(k +""+ v));
    }

}
