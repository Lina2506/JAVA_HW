package Lesson_3;

public class Guitara implements Instrument {
    private int stringCount;
    public Guitara(int stringCount) {
        this.stringCount = stringCount;

    }
    @Override
    public void play() {
        System.out.println("Грає гітара з "+stringCount+ " струнами");
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }
}
