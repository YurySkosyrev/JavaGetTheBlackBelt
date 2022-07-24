package com.javacourse.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierConsumer {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> al = new ArrayList<>();
        for (int i=0; i<3; i++){
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }


    public static void main(String[] args) {
        ArrayList<Car> cars = createThreeCars(() -> new Car("BMW", "red", 300));
        System.out.println(cars);

        changeCar(cars.get(0), car -> {
            car.color = "green";
            car.engine=400;
            System.out.println("Upgraded car: " + car);
        });

        System.out.println(cars);

    }
}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}