package com.javacourse.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResoursesEx {

    public static void main(String[] args) throws IOException {

        String rubai =
                "Не делай зла — вернется бумерангом,\n" +
                "Не плюй в колодец — будешь воду пить,\n" +
                "Не оскорбляй того, кто ниже рангом,\n" +
                "А вдруг придется, что-нибудь просить.\n";

        try(FileWriter writer = new FileWriter("text2")){
            writer.write(rubai);
        }
//        catch (IOException e){
//            e.printStackTrace();
//        }

        try(FileReader reader = new FileReader("text2")){
            int character;
            while ((character=reader.read())!=-1){
                System.out.print((char)character);
            }
        }
    }


}
