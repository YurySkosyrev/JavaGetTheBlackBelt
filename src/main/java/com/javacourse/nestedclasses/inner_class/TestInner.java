package com.javacourse.nestedclasses.inner_class;

public class TestInner {
    public static void main(String[] args) {

//        Car.Engine engine = new Car.Engine(300);

        Car car = new Car("red", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(car);
        System.out.println(engine);

//        Car.Engine engine1 = new car.Engine(150);
//        Car.Engine engine2 = new Car.Engine(150);
        Car.Engine engine3 = new Car("yellow", 2).new Engine(150);
    }
}
