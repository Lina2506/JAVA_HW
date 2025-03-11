package Lesson_3.Insruments;

public class Truba implements Instrument{
    private int diameter;
    public Truba(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Грає труба діаметром "+diameter+ " см");
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
