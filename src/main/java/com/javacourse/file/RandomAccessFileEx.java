package com.javacourse.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("text3.txt", "rw")){

            int a = randomAccessFile.read();
            System.out.println((char)a);

            String s1 = randomAccessFile.readLine();
            System.out.println(s1);

            randomAccessFile.seek(120);
            s1 = randomAccessFile.readLine();
            System.out.println(s1);

            long pointer = randomAccessFile.getFilePointer();
            System.out.println(pointer);

//            randomAccessFile.seek(0);
//            randomAccessFile.writeBytes("Privet");

            randomAccessFile.seek(randomAccessFile.length()-1);
            randomAccessFile.writeBytes("\n" +"Privet");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
