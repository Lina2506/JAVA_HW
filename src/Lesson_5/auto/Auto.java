package Lesson_5.auto;

public class Auto {
    private String name;
    private double power;
    public Owner owner;
    private double price;
    private int year;

    public Auto() {}

    public Auto(String name, int power, Owner owner, double price, int year) {
        this.name = name;
        this.power = power;
        this.owner = owner;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", owner=" + owner +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void repair(){
        this.power = this.power * 1.1;
    }
}
