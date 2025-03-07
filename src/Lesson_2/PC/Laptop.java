package Lesson_2.PC;

public class Laptop extends PC {
    private String colour;

    public Laptop(String producer, String model, int price, String colour) {
        super(producer, model, price);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
