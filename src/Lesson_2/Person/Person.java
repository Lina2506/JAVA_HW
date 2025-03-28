package Lesson_2.Person;

import java.util.List;

//Створити клас котрий відповідає наступній моделі
//{id: 1,name: 'vasya',surname: 'pupkin',
//email: 'asd@asd.com',age: 31,gender: 'MALE',
//skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//car: {model: 'toyota', year: 2021, power: 250}}
public class Person {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List <Skills> skills;
    private Car car;

    public Person() {}

    public Person(int id, String name, String surname, String email, int age, Gender gender, List<Skills> skills, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkillsList(List<Skills> skills) {
        this.skills = skills;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skillsList=" + skills +
                ", car=" + car +
                '}';
    }

    public void info(){
        System.out.println(name+" "+surname+" "+email+" "+age+" "+gender);
        if (car != null){
            car.haveCar();
        }
        System.out.println("Skills:");
        for (Skills skill : skills) {
            skill.Skills();
        }
        };

}
