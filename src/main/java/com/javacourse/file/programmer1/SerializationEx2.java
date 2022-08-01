package com.javacourse.file.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {

    public static void main(String[] args) {

        Car car = new Car("BMW", "black");
        Employee employee = new Employee("Yury", "IT", 700, car);

        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(new FileOutputStream("bestEmployee.bin"))) {

            outputStream.writeObject(employee);
            System.out.println("Done");

        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

}
