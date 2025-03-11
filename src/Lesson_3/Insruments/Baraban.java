package Lesson_3.Insruments;

public class Baraban implements Instrument{
    private int size;
    public Baraban(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Грає барабан розміром " + size + " см");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
