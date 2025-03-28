package Lesson_2.Person;

public class Car {
    private String model;
    private int year;
    private int power;

    public Car(String model, int year, int power) {
        this.model = model;
        this.year = year;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void haveCar(){
        System.out.println("Car:" + model + " year:" + year + " power:" + power);
    }
}
