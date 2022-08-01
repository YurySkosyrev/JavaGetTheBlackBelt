package com.javacourse.file;

import java.io.*;

public class DataInputOutputStreamEx {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("file.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("file.bin"))
             ){

            outputStream.writeByte(5);
            outputStream.writeBoolean(true);
            outputStream.writeDouble(4.5);
            outputStream.writeFloat(1_000_000f);
            outputStream.writeLong(300);

            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readLong());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
