package com.javacourse.nestedclasses.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method(){
        System.out.println(Engine.countOfObjects);
        Engine myEngine = new Engine(400);
        System.out.println(myEngine.horsePower);
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
        private int horsePower;
        private static int countOfObjects;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;

            System.out.println(a);
//            Non-static field 'doorCount' cannot be referenced from a static context
//            System.out.println(doorCount);
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

//    Nested static class (interface) may extend or can be extended
    class Z extends Car.Engine{
        Z(){
            super(200);
        }
    }
}

