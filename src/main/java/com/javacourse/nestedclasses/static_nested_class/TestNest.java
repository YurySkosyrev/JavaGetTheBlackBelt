package com.javacourse.nestedclasses.static_nested_class;

public class TestNest {
    public static void main(String[] args) {
//        Engine e = new Engine(250);
        Car.Engine engine = new Car.Engine(300);
        System.out.println(engine);

        Car car = new Car("red", 2, engine);
        System.out.println(car);

//        Car.Engine engine1 = new car.Engine(120);
    }
}
