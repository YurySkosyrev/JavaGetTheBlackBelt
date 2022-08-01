package com.javacourse.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamEx {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("pic1.jpg");
            FileOutputStream outputStream = new FileOutputStream("pic2.jpg")){

            int i;

            while((i=inputStream.read()) != -1){
                outputStream.write(i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
