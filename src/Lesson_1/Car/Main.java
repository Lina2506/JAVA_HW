package Lesson_1.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW",34.2,3,true));
        cars.add(new Car("Toyota",34.2,1,false));
        cars.add(new Car("Porsche",2.5,2,true));
        cars.add(new Car("Volvo",34.2,4,false));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
