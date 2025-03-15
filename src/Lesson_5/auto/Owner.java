package Lesson_5.auto;

public class Owner {
    private String name;
    private int age;
    private int exp;

    public Owner() {}

    public Owner(String name, int age, int exp) {
        this.name = name;
        this.age = age;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void exp(){
        this.exp++;
    }
}
