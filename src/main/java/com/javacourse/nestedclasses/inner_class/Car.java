package com.javacourse.nestedclasses.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    private int a;


    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;

//        calling the private variable of the inner class
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
//        this.engine = this.new Engine(horsePower);


    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine{
        private int horsePower;

//        inner class cannot have static declaration
//        private static int a;

        private static final int b=1;


        public Engine(int horsePower) {
            this.horsePower = horsePower;

            System.out.println(a);
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

}

