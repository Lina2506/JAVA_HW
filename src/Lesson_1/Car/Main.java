package Lesson_1.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW",100.0,5,true));
        cars.add(new Car("Toyota",60.2,1,false));
        cars.add(new Car("Porsche",80.5,2,true));
        cars.add(new Car("Volvo",45.2,4,false));
        cars.add(new Car("Honda",34.2,3,false));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
