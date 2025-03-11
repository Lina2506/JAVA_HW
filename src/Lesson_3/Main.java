package Lesson_3;

import Lesson_3.Insruments.Baraban;
import Lesson_3.Insruments.Guitara;
import Lesson_3.Insruments.Instrument;
import Lesson_3.Insruments.Truba;
import Lesson_3.Printable.Book;
import Lesson_3.Printable.Magazine;
import Lesson_3.Printable.Printable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
 //_____________________Printable_________________________//
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book("Duna"));
        printables.add(new Magazine("IT"));

        System.out.println(printables);
        for (Printable printable : printables) {
            printable.print();
        }
//__________________Insrtuments_______________________________//
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitara(10));
        instruments.add(new Baraban(20));
        instruments.add(new Truba(30));

        System.out.println(instruments);
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}


